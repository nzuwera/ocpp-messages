# Contributing to OCPP Messages

Thank you for your interest in improving this project! This guide explains how to set up the repo, make changes, and submit contributions.

## Ways to contribute

- Fix bugs or improve code quality
- Add or update OCPP 1.6 JSON Schemas
- Improve generated models (via schema updates or generation config)
- Improve docs and examples

## Development setup

- Java 21
- Maven (recent 3.x)
- Git
- Optional: a Bash shell to run the helper script `add_inheritance.sh` (WSL on Windows works)

## Repository layout

```
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

## Add or update an OCPP message schema

Use this when the schema set is missing a message or needs corrections.

1) Add the schema file
- Place JSON Schema files under `src/main/resources/schemas/ocpp16/`.

2) Ensure schema compatibility
- Prefer the official OCPP schema structure.
- Keep `additionalProperties` and `required` aligned with protocol rules.
- Use consistent naming (Request/Response) as per OCPP 1.6 conventions.

3) Generate Java classes (see next section)

4) Review generated output
- Confirm the class exists and fields match the schema.
- Verify Jackson serialization/deserialization for expected payloads.

## Generate Java classes from schemas

This project uses `jsonschema2pojo-maven-plugin` via a Maven profile to generate sources.

1) Generate sources
```bash
mvn clean generate-sources -P generate-source
```
What to expect:
- Schemas are read from `src/main/resources/schemas/ocpp16/`
- Java sources are generated under `src/main/java/`
- Generated models include Jackson annotations

2) Add inheritance to generated classes

Run the helper script to add `extends Request`/`extends Response` where appropriate:
```bash
# Make the script executable (first time only)
chmod +x add_inheritance.sh

# Run the script to add inheritance
./add_inheritance.sh io.github.nzuwera.ocpp.messages.v1_6
```
What the script does:
- Scans Java files in the package
- Detects Request and Response classes
- Adds the proper imports and `extends Request`/`extends Response`
- Skips base classes and helper/model classes

Example output:
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

If you add or modify schemas, re-run both steps and commit the resulting changes (schemas + generated Java) together as a single coherent update.

## Build & test

```bash
mvn clean package
mvn test
mvn install
```

## CI/CD: GitHub Workflows

This repository uses GitHub Actions.

### Build workflow
- File: `.github/workflows/build.yml`
- Goal: validate changes before merging
- Typical behavior:
  - Runs on pull requests targeting `main`
  - Uses Java 21
  - Builds the project (and runs tests if present)

### Publish workflow
- File: `.github/workflows/publish.yml`
- Goal: publish artifacts to Maven Central when a release is cut
- Typical behavior:
  - Triggered manually (`workflow_dispatch`) and/or when a GitHub Release is published
  - Performs a release build (sources/javadoc/signing) and deploys to Maven Central
  - May create a follow-up PR to keep `pom.xml` version aligned with the release flow
- Required secrets (in repo settings):
  - `OSSRH_USERNAME`
  - `OSSRH_TOKEN`
  - `GPG_PRIVATE_KEY`
  - `GPG_PASSPHRASE`
  - `GITHUB_TOKEN` (provided by GitHub)

## Pull request guidelines

- Create a feature branch from `main`
- Keep changes focused; separate unrelated changes into separate PRs
- If you changed schemas, commit schema files and regenerated Java together
- Keep code style consistent with the existing codebase
- Update docs when behavior or generation steps change
- Ensure `mvn -q -B -e -DskipTests=false test` passes locally

## License

By contributing, you agree that your contributions will be licensed under the Apache License 2.0. See `LICENSE` for details.

## Maintainer

- Gilbert Nzuwera — https://github.com/nzuwera — nzuwera2002@gmail.com