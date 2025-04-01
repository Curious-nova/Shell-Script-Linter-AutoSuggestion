#!/bin/bash

# Build script for Shell Linter project

echo "Building Shell Linter project..."

# Set ANTLR classpath
ANTLR_JAR="antlr-4.9.2-complete.jar"
if [ ! -f "$ANTLR_JAR" ]; then
    echo "Downloading ANTLR JAR..."
    curl -O https://www.antlr.org/download/antlr-4.9.2-complete.jar
fi

# Check if Java is installed
if ! command -v javac &> /dev/null; then
    echo "Error: Java compiler not found. Please install JDK."
    exit 1
fi

# Create build directory
mkdir -p build

# Set classpath
CLASSPATH=".:$ANTLR_JAR:build"

# Generate lexer from grammar
echo "Generating lexer from grammar..."
java -cp "$ANTLR_JAR" org.antlr.v4.Tool -o build antlr/ShellLexer.g4

# Check if lexer generation was successful
if [ $? -ne 0 ]; then
    echo "Error generating lexer. Exiting."
    exit 1
fi

# Generate parser from grammar
echo "Generating parser from grammar..."
java -cp "$ANTLR_JAR" org.antlr.v4.Tool -o build -lib build antlr/ShellParser.g4

# Check if parser generation was successful
if [ $? -ne 0 ]; then
    echo "Error generating parser. Exiting."
    exit 1
fi

# Compile Java files
echo "Compiling Java files..."
javac -cp "$CLASSPATH" -d build javaFiles/ShellErrorListener.java javaFiles/SuggestionEngine.java javaFiles/ShellLinter.java build/*.java

# Check if compilation was successful
if [ $? -ne 0 ]; then
    echo "Error compiling Java files. Exiting."
    exit 1
fi

echo "Build completed successfully!"
echo "To run the linter, use: java -cp 'build:$ANTLR_JAR' ShellLinter test_valid.sh"