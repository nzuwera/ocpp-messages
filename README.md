# OCPP Messages (Java)

A Java library of **type-safe OCPP message POJOs**, generated from the official JSON Schemas. It’s intended to be used as a shared “messages module” in OCPP 1.6 implementations (Charge Point and Central System) and any tooling that needs reliable serialization/deserialization.

---

## Table of Contents

- [Why this library](#why-this-library)
- [Supported Protocols](#supported-protocols)
- [Installation (End Users)](#installation-end-users)
- [Quick Start (End Users)](#quick-start-end-users)
- [Developer Guide](#developer-guide)
  - [Repository Layout](#repository-layout)
  - [Add a New OCPP Message Schema](#add-a-new-ocpp-message-schema)
  - [Generate Java Classes from Schemas](#generate-java-classes-from-schemas)
  - [Build & Test](#build--test)
- [CI/CD: GitHub Workflows](#cicd-github-workflows)
  - [Build Workflow](#build-workflow)
  - [Publish Workflow](#publish-workflow)
- [Contributing](#contributing)
- [License](#license)
- [Maintainer](#maintainer)
- [Links](#links)

---

## Why this library

- **Type-safe message models** instead of handwritten DTOs.
- **Schema-driven generation** for consistency and easier upgrades.
- **Jackson-friendly** models (annotations ready for JSON mapping).
- **Maven Central distribution** for easy consumption.

---

## Supported Protocols

- **OCPP 1.6**: standard message set (generated from JSON schemas)

---

## Installation (End Users)

Add the dependency to your `pom.xml`:

```
xml
<dependency>
<groupId>io.github.nzuwera.ocpp</groupId>
<artifactId>messages</artifactId>
<version>0.0.1</version>
</dependency>
```

---

## Quick Start (End Users)

Serialize and deserialize OCPP messages with Jackson:
```
java
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.nzuwera.ocpp.messages.v1_6.Authorize;

public class Example {
public static void main(String[] args) throws Exception {
ObjectMapper mapper = new ObjectMapper();

        // Create an OCPP message
        Authorize authorize = new Authorize();
        authorize.setIdTag("RFID123456");

        // Serialize to JSON
        String json = mapper.writeValueAsString(authorize);

        // Deserialize from JSON
        Authorize parsed = mapper.readValue(json, Authorize.class);

        System.out.println(json);
        System.out.println(parsed.getIdTag());
    }
}
```
Notes:
- This project provides **message classes**; it does not implement transport (WebSocket) or OCPP framing by itself.
- Use these classes in your client/server to map payloads reliably.

---

## Developer Guide

### Repository Layout

High-level structure:
```
text
ocpp-messages/
├── src/
│   └── main/
│       ├── java/
│       │   └── io/github/nzuwera/ocpp/messages/
│       │       ├── Request.java
│       │       ├── Response.java
│       │       └── v1_6/                 (generated OCPP 1.6 classes)
│       └── resources/
│           └── schemas/
│               └── ocpp16/               (OCPP 1.6 JSON schemas)
├── pom.xml
└── README.md
```
### Add a New OCPP Message Schema

Use this when the schema set is missing a message (or you are updating/patching schemas).

1. **Add the schema file**
   - Put the JSON schema into:
     - `src/main/resources/schemas/ocpp16/`

2. **Ensure the schema is compatible with generation**
   - Prefer OCPP’s official schema structure.
   - Keep `additionalProperties` and `required` aligned with the protocol rules.
   - Use consistent naming (message request/response naming as per OCPP 1.6 conventions).

3. **Generate Java classes** (next section)

4. **Review the generated output**
   - Confirm the generated class exists and fields match the schema.
   - Check Jackson serialization/deserialization works for your expected JSON payloads.

### Generate Java Classes from Schemas

The project uses **`jsonschema2pojo-maven-plugin`** via a Maven profile.

**Step 1: Generate sources**
```bash
mvn clean generate-sources -P generate-source
```
What to expect:
- Schemas are read from `src/main/resources/schemas/ocpp16/`
- Java sources are generated under `src/main/java/`
- Generated models include Jackson annotations for JSON mapping

**Step 2: Add inheritance to generated classes**

After generating the classes, run the `add_inheritance.sh` script to add proper inheritance:

```bash
# Make the script executable (first time only)
chmod +x add_inheritance.sh

# Run the script to add inheritance
./add_inheritance.sh io.github.nzuwera.ocpp.messages.v1_6
```

**What the script does:**
- Scans all Java files in the specified package
- Identifies Request classes (files containing "Request" in JavaDoc, not ending with "Response")
- Identifies Response classes (files ending with "Response" or containing "Response" in JavaDoc)
- Adds `import io.github.nzuwera.ocpp.messages.Request;` or `Response;` import statements
- Adds `extends Request` or `extends Response` to class declarations
- Skips base classes (`Request.java`, `Response.java`) and helper/model classes
- Shows colored output with summary statistics

**Example output:**
```
Processing package: io.github.nzuwera.ocpp.messages.v1_6
Source directory: src/main/java/io/github/nzuwera/ocpp/messages/v1_6

Processing Request: Authorize.java
  ✓ Added Request inheritance

Processing Response: AuthorizeResponse.java
  ✓ Added Response inheritance

════════════════════════════════════════
Summary:
  Request classes updated:  28
  Response classes updated: 28
  Already extended:         0
  Helper/model classes:     8
════════════════════════════════════════
Done! Modified 56 files.
```

If you add or modify schemas, re-run both generation steps and commit the resulting changes (schemas + generated Java) as a single coherent update.

### Build & Test
```bash
mvn clean package
mvn test
mvn install
```
---

## CI/CD: GitHub Workflows

This repository uses GitHub Actions to ensure build quality and to automate releases.

### Build Workflow

**File:** `.github/workflows/build.yml`  
**Goal:** Validate changes before merging.

Typical behavior:
- Runs on pull requests targeting `main`
- Uses Java 21
- Builds the project (and runs tests, if present) to ensure the repository stays in a releasable state

### Publish Workflow

**File:** `.github/workflows/publish.yml`  
**Goal:** Publish artifacts to Maven Central when a release is cut.

Typical behavior:
- Triggered manually (`workflow_dispatch`) and/or when a GitHub Release is published
- Performs a release build (sources/javadoc/signing) and deploys to Maven Central
- May create a follow-up PR to keep `pom.xml` version aligned with the release flow

Required secrets (configured in the GitHub repository settings):
- `OSSRH_USERNAME`
- `OSSRH_TOKEN`
- `GPG_PRIVATE_KEY`
- `GPG_PASSPHRASE`
- `GITHUB_TOKEN` (provided by GitHub Actions)

Release usage (typical):
1. Create a GitHub Release with a tag like `vX.Y.Z`
2. The workflow publishes to Maven Central using the release profile
3. Any version bump automation (if configured) syncs `main` accordingly

---

## Contributing

- Fork the repository
- Create a feature branch
- Make changes (schemas and generated sources when applicable)
- Open a Pull Request against `main`

---

## License

Apache License 2.0. See `LICENSE` (or the Apache 2.0 text) for details.

---

## Maintainer

- Name: **Gilbert Nzuwera**  
- GitHub: [@nzuwera](https://github.com/nzuwera)  
- Email: nzuwera2002@gmail.com

---

## Links

- Repository: https://github.com/nzuwera/ocpp-messages
- OCPP 1.6 overview: https://openchargealliance.org/protocols/open-charge-point-protocol/#OCPP1.6
