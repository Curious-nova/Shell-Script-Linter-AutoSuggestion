import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShellLinter {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java ShellLinter <shell_script_file>");
            System.exit(1);
        }

        String fileName = args[0];

        try {
            String scriptContent = new String(Files.readAllBytes(Paths.get(fileName)));
            processScript(scriptContent, fileName);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
    }

    public static void processScript(String scriptContent, String fileName) {
        // Create lexer and parser
        CharStream input = CharStreams.fromString(scriptContent);
        ShellLexer lexer = new ShellLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ShellParser parser = new ShellParser(tokens);

        // Create suggestion engine
        SuggestionEngine suggestionEngine = new SuggestionEngine();

        // Set custom error listener
        ShellErrorListener errorListener = new ShellErrorListener(suggestionEngine);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        // Start parsing
        System.out.println("Analyzing script: " + fileName);
        System.out.println("------------------------");

        try {
            // Parse the script
            ParseTree tree = parser.script();

            // If no syntax errors were reported by the listener
            if (errorListener.getSyntaxErrors().isEmpty()) {
                System.out.println("No syntax errors found!");
            }

        } catch (Exception e) {
            System.err.println("Exception during parsing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}