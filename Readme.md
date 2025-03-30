# Bash Shell Scripting Linter and Auto-Suggestion Tool

This tool is a linter and auto-suggestion system for Bash shell scripts, built using ANTLR and Java. It highlights errors in user-provided shell commands and suggests corrections for invalid or incorrectly formatted commands.

## Features

- Syntax validation for Bash shell scripts
- Error detection and reporting
- Context-aware suggestions for fixing errors
- Support for common Bash constructs:
    - Conditionals (if, then, elif, else, fi)
    - Loops (for, while, do, done)
    - Command pipelines (|)
    - Redirections (>, >>, 2>, &>)
    - Variable assignments
    - Function definitions

## Technical Implementation

The project is built using:
- **ANTLR4** for grammar definition and parsing
- **Java** for the main application logic

### Components

1. **Grammar Files**:
    - `ShellLexer.g4`: Defines tokens for the Bash shell language
    - `ShellParser.g4`: Defines grammar rules for the Bash shell language

2. **Java Classes**:
    - `ShellLinter.java`: Main application class
    - `ShellErrorListener.java`: Custom error listener for capturing and reporting errors
    - `SuggestionEngine.java`: Engine for generating suggestions based on error context

3. **Test Files**:
    - `test_valid.sh`: A valid shell script for testing
    - `test_invalid.sh`: A shell script with errors for testing

## Building the Project

Use the included `build.sh` script to compile the project:

```bash
chmod +x build.sh
./build.sh
```

This will:
1. Check for required dependencies (ANTLR4 and Java)
2. Generate lexer and parser code from grammar files
3. Compile all Java files

## Running the Linter

To analyze a shell script:

```bash
java -cp "build:antlr-4.9.2-complete.jar" ShellLinter your_script.sh
```

## Example Output

When analyzing a script with errors, the linter will provide detailed information about each error and suggestions for fixing it:

```
Analyzing script: test_invalid.sh
------------------------
Line 5:13 - extraneous input '"Hello, world' expecting {<EOF>, NEWLINE, SEMI}
Context: "echo "Hello, world"
Suggestions:
  - Missing closing quote
  - Try: echo "Hello, world"

Line 8:7 - no viable alternative at input 'name = '
Context: "name = "John""
Suggestions:
  - Variable assignments shouldn't have spaces around '='
  - Correct syntax: variable=value
```

## Requirements

- Java JDK 8 or higher
- ANTLR4 runtime (included in build process)