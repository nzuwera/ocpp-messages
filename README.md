# OCPP Messages (Java)

Type-safe OCPP message POJOs for Java, generated from the official OCPP JSON Schemas. Use this library in OCPP 1.6 Charge Point and Central System implementations for reliable JSON serialization/deserialization.

## Why use this library

- Type‑safe message models (no more ad‑hoc DTOs)
- Schema‑driven generation for consistency and easier upgrades
- Jackson‑friendly classes out of the box
- Published to Maven Central for easy consumption

## Supported protocols

- OCPP 1.6 (generated from JSON Schemas)

## Installation

Add the dependency to your `pom.xml`:

```xml
<dependency>
  <groupId>io.github.nzuwera.ocpp</groupId>
  <artifactId>messages</artifactId>
  <version>0.0.1</version>
</dependency>
```

## Quick start

Serialize and deserialize OCPP messages with Jackson:

```java
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.nzuwera.ocpp.messages.v1_6.AuthorizeRequest;

public class Example {
  public static void main(String[] args) throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    // Create an OCPP 1.6 Authorize request
    AuthorizeRequest authorize = new AuthorizeRequest();
    authorize.setIdTag("RFID123456");

    // Serialize to JSON
    String json = mapper.writeValueAsString(authorize);

    // Deserialize from JSON
    AuthorizeRequest parsed = mapper.readValue(json, AuthorizeRequest.class);

    System.out.println(json);
    System.out.println(parsed.getIdTag());
  }
}
```

Notes:
- This project provides message classes only; it does not implement WebSocket transport or OCPP framing.
- Use these classes in your client/server to map payloads reliably.

## Links

- Repository: https://github.com/nzuwera/ocpp-messages
- OCPP 1.6 overview: https://openchargealliance.org/protocols/open-charge-point-protocol/#OCPP1.6

## Contributing

Thinking about contributing? Thank you! Please read the contribution guide:

- CONTRIBUTING: ./CONTRIBUTING.md

## License

Apache License 2.0. See `LICENSE` for details.

## Maintainer

- Gilbert Nzuwera — GitHub: https://github.com/nzuwera — Email: nzuwera2002@gmail.com
