package io.github.nzuwera.ocpp.messages;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.victools.jsonschema.generator.Option;
import com.github.victools.jsonschema.generator.OptionPreset;
import com.github.victools.jsonschema.generator.SchemaGenerator;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfig;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import com.github.victools.jsonschema.generator.SchemaVersion;
import com.github.victools.jsonschema.module.jackson.JacksonModule;
import com.github.victools.jsonschema.module.jackson.JacksonOption;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class SchemaMatchesGeneratedClassTest {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final String OCPP_16_SCHEMA_PATH = "schemas/ocpp16/";

    @TestFactory
    Stream<DynamicTest> schemas_match_generated_classes() {
        List<String> schemaResourcePaths = discoverSchemaResources(OCPP_16_SCHEMA_PATH);
        assertFalse(schemaResourcePaths.isEmpty(), "No schema resources discovered");

        return schemaResourcePaths.stream().map(schemaPath ->
                dynamicTest(schemaPath, () -> {
                    JsonNode schemaFromFile = readResourceJson(schemaPath);

                    String fqcn = mapSchemaPathToFqcn(schemaFromFile, schemaPath);
                    Class<?> clazz = Class.forName(fqcn);

                    JsonNode schemaFromClass = generateJsonSchemaFor(clazz);

                    JsonNode normalizedFile = normalizeSchema(schemaFromFile);
                    JsonNode normalizedGenerated = normalizeSchema(schemaFromClass);

                    // Loose comparison: "generated" must be compatible with "file"
                    assertSchemaLooselyMatches(normalizedFile, normalizedGenerated, schemaPath, fqcn);
                })
        );
    }

    private static List<String> discoverSchemaResources(String schemaPath) {
        try {
            URI schemasDirUri = Objects.requireNonNull(SchemaMatchesGeneratedClassTest.class
                            .getClassLoader()
                            .getResource(schemaPath))
                    .toURI();

            Path schemasDir = Paths.get(schemasDirUri);

            return Files.walk(schemasDir)
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".json"))
                    .map(path -> {
                        Path relativePath = schemasDir.relativize(path);
                        return schemaPath + relativePath.toString().replace('\\', '/');
                    })
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException | URISyntaxException | NullPointerException e) {
            throw new RuntimeException("Failed to discover schema resources in schemas/ocpp16", e);
        }
    }

    private static JsonNode readResourceJson(String resourcePath) throws Exception {
        try (InputStream in = SchemaMatchesGeneratedClassTest.class.getClassLoader().getResourceAsStream(resourcePath)) {
            assertNotNull(in, "Missing resource: " + resourcePath);
            return MAPPER.readTree(in);
        }
    }

    private static String mapSchemaPathToFqcn(JsonNode schema, String schemaPath) {
        if (schema.has("title")) {
            String className = schema.get("title").asText();
            return "io.github.nzuwera.ocpp.messages.v1_6." + className;
        }

        String simpleName = schemaPath.substring(schemaPath.lastIndexOf('/') + 1).replace(".json", "");
        return "io.github.nzuwera.ocpp.messages.v1_6." + simpleName;
    }

    private static JsonNode generateJsonSchemaFor(Class<?> clazz) {
        JacksonModule jacksonModule = new JacksonModule(
                JacksonOption.RESPECT_JSONPROPERTY_ORDER,
                JacksonOption.FLATTENED_ENUMS_FROM_JSONVALUE
        );

        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(
                SchemaVersion.DRAFT_6,
                OptionPreset.PLAIN_JSON
        )
                .with(jacksonModule)
                .with(Option.FORBIDDEN_ADDITIONAL_PROPERTIES_BY_DEFAULT);

        SchemaGeneratorConfig config = configBuilder.build();
        SchemaGenerator generator = new SchemaGenerator(config);

        return generator.generateSchema(clazz);
    }

    private static JsonNode normalizeSchema(JsonNode node) {
        return normalize(node.deepCopy());
    }

    private static JsonNode normalize(JsonNode node) {
        if (node == null) return null;

        if (node.isObject()) {
            ObjectNode obj = (ObjectNode) node;

            // Drop keys that are either non-semantic or often not reproducible from Java types.
            List<String> dropKeys = List.of(
                    "$schema", "id", "$id", "title", "description", "examples", "default", "format",
                    "maxLength", "minLength", "maximum", "minimum", "multipleOf", "pattern",
                    "required" // intentionally ignored for loose comparison
            );
            dropKeys.forEach(obj::remove);

            // "additionalProperties" differs a lot between authors/generators; keep structure checks loose.
            // If you still want to enforce it at the root only, do it in assertSchemaLooselyMatches() instead.
            // (So here we don't remove it globally; we just tolerate it later.)
            if (obj.has("enum") && obj.has("additionalProperties")) {
                obj.remove("additionalProperties");
            }

            if (obj.has("properties") && obj.get("properties").isObject()) {
                ObjectNode props = (ObjectNode) obj.get("properties");
                if (!props.isEmpty()) {
                    List<String> propNames = new ArrayList<>();
                    props.fieldNames().forEachRemaining(propNames::add);
                    Collections.sort(propNames);

                    ObjectNode sortedProps = MAPPER.createObjectNode();
                    for (String p : propNames) {
                        sortedProps.set(p, normalize(props.get(p)));
                    }
                    obj.set("properties", sortedProps);
                }
            }

            Iterator<Map.Entry<String, JsonNode>> fields = obj.fields();
            List<String> names = new ArrayList<>();
            while (fields.hasNext()) names.add(fields.next().getKey());

            for (String name : names) {
                if (!"properties".equals(name)) {
                    obj.set(name, normalize(obj.get(name)));
                }
            }

            return obj;
        }

        if (node.isArray()) {
            ArrayNode arr = (ArrayNode) node;
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, normalize(arr.get(i)));
            }
            return arr;
        }

        return node;
    }

    /**
     * Loose schema comparison.
     *
     * Rules (pragmatic, schema-generator-friendly):
     * - For each expected property, the generated schema must contain it.
     * - Types must be compatible (expected types are a subset of actual types).
     * - For enums, expected values must be a subset of actual values.
     * - Recurse into "properties" and "items".
     * - Ignore: required, additionalProperties, numeric/string constraints, titles, ids, formats, etc.
     * - For composition keywords (oneOf/anyOf/allOf): each expected variant must have a compatible variant in actual.
     */
    private static void assertSchemaLooselyMatches(JsonNode expected, JsonNode actual, String schemaPath, String fqcn) {
        Deque<String> at = new ArrayDeque<>();
        at.addLast(schemaPath);

        try {
            assertSchemaCompatible(expected, actual, at);
        } catch (AssertionError e) {
            fail("Schema mismatch (loose) for " + schemaPath + " <-> " + fqcn + "\nAt: " + String.join("", at) + "\n" + e.getMessage());
        }
    }

    private static void assertSchemaCompatible(JsonNode expected, JsonNode actual, Deque<String> at) {
        assertNotNull(expected, "Expected schema node is null at " + String.join("", at));
        assertNotNull(actual, "Actual schema node is null at " + String.join("", at));

        // If expected doesn't constrain anything meaningful, don't fail.
        if (expected.isMissingNode() || expected.isNull()) {
            return;
        }

        // If expected is a $ref, accept: generators often inline or ref differently.
        if (expected.isObject() && expected.has("$ref")) {
            return;
        }

        // Type compatibility (expected types must be a subset of actual types).
        Set<String> expectedTypes = readTypes(expected);
        if (!expectedTypes.isEmpty()) {
            Set<String> actualTypes = readTypes(actual);
            if (!actualTypes.isEmpty()) {
                assertTrue(actualTypes.containsAll(expectedTypes),
                        "Type mismatch. expected=" + expectedTypes + ", actual=" + actualTypes);
            }
        }

        // Enum compatibility (expected enum values must be a subset of actual enum values).
        if (expected.has("enum") && expected.get("enum").isArray()) {
            Set<String> expectedEnum = readStringSet(expected.get("enum"));
            Set<String> actualEnum = (actual.has("enum") && actual.get("enum").isArray())
                    ? readStringSet(actual.get("enum"))
                    : Set.of();

            assertFalse(actualEnum.isEmpty(), "Expected enum but actual has no enum");
            assertTrue(actualEnum.containsAll(expectedEnum),
                    "Enum mismatch. expected subset=" + expectedEnum + ", actual=" + actualEnum);
        }

        // Const compatibility (if present).
        if (expected.has("const")) {
            assertTrue(actual.has("const"), "Expected const but actual has no const");
            assertEquals(expected.get("const"), actual.get("const"), "Const mismatch");
        }

        // Object properties:
        // If expected has properties:
        //  - if empty => accept missing/empty actual properties
        //  - if non-empty => actual must have properties and contain all expected keys (recursively compatible)
        if (expected.has("properties") && expected.get("properties").isObject()) {
            ObjectNode expectedProps = (ObjectNode) expected.get("properties");

            // Many generators omit "properties": {} for empty objects, while hand-authored schemas include it.
            if (!expectedProps.isEmpty()) {
                assertTrue(actual.has("properties") && actual.get("properties").isObject(),
                        "Expected object with properties, but actual has no properties object");

                ObjectNode actualProps = (ObjectNode) actual.get("properties");

                Iterator<String> expectedFieldNames = expectedProps.fieldNames();
                while (expectedFieldNames.hasNext()) {
                    String propName = expectedFieldNames.next();
                    assertTrue(actualProps.has(propName), "Missing property in generated schema: " + propName);

                    at.addLast(".properties[" + propName + "]");
                    assertSchemaCompatible(expectedProps.get(propName), actualProps.get(propName), at);
                    at.removeLast();
                }
            }
        }

        // Arrays: validate "items" if expected has it (loose, but still structural).
        if (expected.has("items")) {
            assertTrue(actual.has("items"), "Expected array items definition, but actual has no items");

            JsonNode expectedItems = expected.get("items");
            JsonNode actualItems = actual.get("items");

            at.addLast(".items");
            assertItemsCompatible(expectedItems, actualItems, at);
            at.removeLast();
        }

        // Additional schema composition keywords:
        // each expected variant must match at least one actual variant.
        assertCompositionCompatible("oneOf", expected, actual, at);
        assertCompositionCompatible("anyOf", expected, actual, at);
        assertCompositionCompatible("allOf", expected, actual, at);

        // Note: we intentionally ignore:
        // - required
        // - additionalProperties
        // - min/max/pattern/format/etc.
        // - property order
        // because those are often not reliably inferred from Java reflection alone.
    }
    private static void assertItemsCompatible(JsonNode expectedItems, JsonNode actualItems, Deque<String> at) {
        // Tuple validation (array of schemas) vs single schema
        if (expectedItems.isArray()) {
            assertTrue(actualItems.isArray(), "Expected tuple-typed items (array), but actual items is not an array");

            ArrayNode expArr = (ArrayNode) expectedItems;
            ArrayNode actArr = (ArrayNode) actualItems;

            // Loose strategy: same length, and each index compatible
            assertEquals(expArr.size(), actArr.size(), "Tuple items length mismatch");

            for (int i = 0; i < expArr.size(); i++) {
                at.addLast("[" + i + "]");
                assertSchemaCompatible(expArr.get(i), actArr.get(i), at);
                at.removeLast();
            }
            return;
        }

        // Single schema item
        assertSchemaCompatible(expectedItems, actualItems, at);
    }

    private static void assertCompositionCompatible(String keyword, JsonNode expected, JsonNode actual, Deque<String> at) {
        if (!(expected.has(keyword) && expected.get(keyword).isArray())) {
            return;
        }
        assertTrue(actual.has(keyword) && actual.get(keyword).isArray(),
                "Expected " + keyword + " but actual has none");

        ArrayNode expectedVariants = (ArrayNode) expected.get(keyword);
        ArrayNode actualVariants = (ArrayNode) actual.get(keyword);

        for (int i = 0; i < expectedVariants.size(); i++) {
            JsonNode expectedVariant = expectedVariants.get(i);

            boolean foundMatch = false;
            for (int j = 0; j < actualVariants.size(); j++) {
                JsonNode actualVariant = actualVariants.get(j);
                try {
                    Deque<String> probe = new ArrayDeque<>(at);
                    probe.addLast("." + keyword + "[expected:" + i + "->actual:" + j + "]");
                    assertSchemaCompatible(expectedVariant, actualVariant, probe);
                    foundMatch = true;
                    break;
                } catch (AssertionError ignored) {
                    // try next variant
                }
            }

            assertTrue(foundMatch, "No compatible match found for " + keyword + "[" + i + "]");
        }
    }

    private static Set<String> readTypes(JsonNode schemaNode) {
        if (schemaNode == null || !schemaNode.has("type")) {
            return Set.of();
        }
        JsonNode typeNode = schemaNode.get("type");
        if (typeNode.isTextual()) {
            return Set.of(typeNode.asText());
        }
        if (typeNode.isArray()) {
            Set<String> types = new HashSet<>();
            typeNode.forEach(n -> {
                if (n.isTextual()) {
                    types.add(n.asText());
                }
            });
            return types;
        }
        return Set.of();
    }

    private static Set<String> readStringSet(JsonNode arrayNode) {
        if (arrayNode == null || !arrayNode.isArray()) return Set.of();
        Set<String> out = new HashSet<>();
        arrayNode.forEach(n -> out.add(n.asText()));
        return out;
    }
}