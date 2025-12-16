#!/bin/bash

# Script to add inheritance to OCPP Request and Response classes
# Usage: ./add_inheritance.sh <package_name>
# Example: ./add_inheritance.sh io.github.nzuwera.ocpp.messages.v1_6

# Color codes for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Check if package name is provided
if [ -z "$1" ]; then
    echo -e "${RED}Error: Package name is required${NC}"
    echo "Usage: $0 <package_name>"
    echo "Example: $0 io.github.nzuwera.ocpp.messages.v1_6"
    exit 1
fi

PACKAGE_NAME="$1"

# Convert package name to directory path (replace dots with slashes)
PACKAGE_PATH=$(echo "$PACKAGE_NAME" | tr '.' '/')

# Find the source directory
if [ -d "src/main/java/$PACKAGE_PATH" ]; then
    SOURCE_DIR="src/main/java/$PACKAGE_PATH"
elif [ -d "$PACKAGE_PATH" ]; then
    SOURCE_DIR="$PACKAGE_PATH"
else
    echo -e "${RED}Error: Could not find package directory${NC}"
    echo "Tried: src/main/java/$PACKAGE_PATH and $PACKAGE_PATH"
    exit 1
fi

echo -e "${BLUE}Processing package: ${PACKAGE_NAME}${NC}"
echo -e "${BLUE}Source directory: ${SOURCE_DIR}${NC}"
echo ""

# Extract base package for Request and Response classes
BASE_PACKAGE=$(echo "$PACKAGE_NAME" | sed 's/\.[^.]*$//')

REQUEST_IMPORT="import io.github.nzuwera.ocpp.messages.Request;"
RESPONSE_IMPORT="import io.github.nzuwera.ocpp.messages.Response;"

# Counters
REQUEST_COUNT=0
RESPONSE_COUNT=0
SKIPPED_COUNT=0
ALREADY_DONE_COUNT=0

# Function to check if file is a Request class
is_request_class() {
    local file="$1"
    local filename=$(basename "$file" .java)

    # Check if filename doesn't end with "Response" and file contains "Request" in JavaDoc
    if [[ ! "$filename" =~ Response$ ]] && grep -q "Request" "$file" 2>/dev/null; then
        return 0
    fi
    return 1
}

# Function to check if file is a Response class
is_response_class() {
    local file="$1"
    local filename=$(basename "$file" .java)

    # Check if filename ends with "Response" or file contains "Response" in JavaDoc
    if [[ "$filename" =~ Response$ ]] || grep -q ".*Response" "$file" 2>/dev/null; then
        return 0
    fi
    return 1
}

# Function to check if class already extends something
already_extends() {
    local file="$1"
    grep -q "public class .* extends " "$file" 2>/dev/null
    return $?
}

# Function to add import after package declaration
add_import() {
    local file="$1"
    local import_statement="$2"

    # Check if import already exists
    if grep -q "^${import_statement}" "$file" 2>/dev/null; then
        return 0
    fi

    # Find line number of last import or package statement
    local last_import_line=$(grep -n "^import " "$file" 2>/dev/null | tail -1 | cut -d: -f1)

    if [ -z "$last_import_line" ]; then
        # No imports yet, add after package statement
        local package_line=$(grep -n "^package " "$file" 2>/dev/null | cut -d: -f1)
        if [ -n "$package_line" ]; then
            # Add blank line and import after package
            sed -i "${package_line}a\\
\\
${import_statement}" "$file"
        fi
    else
        # Add import after last import
        sed -i "${last_import_line}a\\
${import_statement}" "$file"
    fi
}

# Function to add extends clause to class declaration
add_extends_clause() {
    local file="$1"
    local base_class="$2"

    # Match class declaration and add extends clause
    # This handles both cases: with and without @Generated annotation above
    sed -i "s/^\(public class [A-Za-z0-9_]*\) {$/\1 extends ${base_class} {/g" "$file"
}

# Function to add Request inheritance
add_request_inheritance() {
    local file="$1"
    local filename=$(basename "$file")

    echo -e "${YELLOW}Processing Request: ${filename}${NC}"

    # Check if already extends Request
    if grep -q "extends Request" "$file" 2>/dev/null; then
        echo -e "${GREEN}  ✓ Already extends Request${NC}"
        ((ALREADY_DONE_COUNT++))
        return 0
    fi

    # Check if already extends something else
    if already_extends "$file"; then
        echo -e "${YELLOW}  ⚠ Already extends another class, skipping${NC}"
        ((SKIPPED_COUNT++))
        return 0
    fi

    # Add import
    add_import "$file" "$REQUEST_IMPORT"

    # Add extends Request to class declaration
    add_extends_clause "$file" "Request"

    echo -e "${GREEN}  ✓ Added Request inheritance${NC}"
    ((REQUEST_COUNT++))
    return 0
}

# Function to add Response inheritance
add_response_inheritance() {
    local file="$1"
    local filename=$(basename "$file")

    echo -e "${YELLOW}Processing Response: ${filename}${NC}"

    # Check if already extends Response
    if grep -q "extends Response" "$file" 2>/dev/null; then
        echo -e "${GREEN}  ✓ Already extends Response${NC}"
        ((ALREADY_DONE_COUNT++))
        return 0
    fi

    # Check if already extends something else
    if already_extends "$file"; then
        echo -e "${YELLOW}  ⚠ Already extends another class, skipping${NC}"
        ((SKIPPED_COUNT++))
        return 0
    fi

    # Add import
    add_import "$file" "$RESPONSE_IMPORT"

    # Add extends Response to class declaration
    add_extends_clause "$file" "Response"

    echo -e "${GREEN}  ✓ Added Response inheritance${NC}"
    ((RESPONSE_COUNT++))
    return 0
}

# Process all Java files in the package
echo -e "${BLUE}Scanning for Java files...${NC}"
echo ""

for file in "$SOURCE_DIR"/*.java; do
    if [ ! -f "$file" ]; then
        continue
    fi

    filename=$(basename "$file" .java)

    # Skip base classes
    if [ "$filename" = "Request" ] || [ "$filename" = "Response" ]; then
        echo -e "${BLUE}Skipping base class: ${filename}.java${NC}"
        echo ""
        continue
    fi

    # Check if it's a Request or Response class
    if is_request_class "$file"; then
        add_request_inheritance "$file" || true
    elif is_response_class "$file"; then
        add_response_inheritance "$file" || true
    else
        echo -e "${BLUE}Skipping helper/model class: ${filename}.java${NC}"
        ((SKIPPED_COUNT++))
    fi

    echo ""
done

# Summary
echo -e "${BLUE}════════════════════════════════════════${NC}"
echo -e "${BLUE}Summary:${NC}"
echo -e "${GREEN}  Request classes updated:  ${REQUEST_COUNT}${NC}"
echo -e "${GREEN}  Response classes updated: ${RESPONSE_COUNT}${NC}"
echo -e "${YELLOW}  Already extended:         ${ALREADY_DONE_COUNT}${NC}"
echo -e "${BLUE}  Helper/model classes:     ${SKIPPED_COUNT}${NC}"
echo -e "${BLUE}════════════════════════════════════════${NC}"

if [ $REQUEST_COUNT -eq 0 ] && [ $RESPONSE_COUNT -eq 0 ]; then
    if [ $ALREADY_DONE_COUNT -gt 0 ]; then
        echo -e "${GREEN}All classes already extend the correct base classes!${NC}"
    else
        echo -e "${YELLOW}No Request or Response classes found to process.${NC}"
    fi
else
    echo -e "${GREEN}Done! Modified $((REQUEST_COUNT + RESPONSE_COUNT)) files.${NC}"
fi