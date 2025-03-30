import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.atn.ATN;

import java.util.*;
import java.util.stream.Collectors;

public class SuggestionEngine {
    private final Map<String, List<String>> commonMistakes;

    public SuggestionEngine() {
        // Initialize common shell command mistakes and corrections
        commonMistakes = new HashMap<>();

        // Common command typos
        commonMistakes.put("cd..", Arrays.asList("cd ..", "cd .."));
        commonMistakes.put("ech", Arrays.asList("echo"));
        commonMistakes.put("ecoh", Arrays.asList("echo"));
        commonMistakes.put("grpe", Arrays.asList("grep"));
        commonMistakes.put("ls-l", Arrays.asList("ls -l"));
        commonMistakes.put("mkidr", Arrays.asList("mkdir"));
        commonMistakes.put("rmdir", Arrays.asList("rm -r", "rm -rf"));

        // Common syntax errors
        commonMistakes.put("if", Arrays.asList("if [ condition ]; then", "if [[ condition ]]; then"));
        commonMistakes.put("then", Arrays.asList("if [ condition ]; then"));
        commonMistakes.put("fi", Arrays.asList("if [ condition ]; then\n    commands\nfi"));
        commonMistakes.put("for", Arrays.asList("for var in list; do", "for ((i=0; i<10; i++)); do"));
        commonMistakes.put("while", Arrays.asList("while [ condition ]; do", "while [[ condition ]]; do"));
        commonMistakes.put("do", Arrays.asList("while [ condition ]; do", "for var in list; do"));
        commonMistakes.put("done", Arrays.asList("done"));

        // Redirection and pipes
        commonMistakes.put(">", Arrays.asList("command > file", "command > /dev/null"));
        commonMistakes.put(">>", Arrays.asList("command >> file", "command >> /dev/null"));
        commonMistakes.put("2>", Arrays.asList("command 2> error.log", "command 2> /dev/null"));
        commonMistakes.put("&>", Arrays.asList("command &> output.log", "command &> /dev/null"));
        commonMistakes.put("|", Arrays.asList("command1 | command2", "command1 | grep pattern"));
    }

    public List<String> getSuggestions(ShellErrorListener.SyntaxError error, String context) {
        List<String> suggestions = new ArrayList<>();

        // Get suggestions based on the offending symbol
        if (error.getOffendingSymbol() instanceof Token) {
            Token token = (Token) error.getOffendingSymbol();

            // Add suggestions based on token text
            String tokenText = token.getText();
            if (commonMistakes.containsKey(tokenText)) {
                suggestions.addAll(commonMistakes.get(tokenText));
            }

            // Get expected tokens
            if (error.getException() instanceof NoViableAltException) {
                NoViableAltException nvae = (NoViableAltException) error.getException();
                Parser recognizer = (Parser) error.getRecognizer();
                ATN atn = recognizer.getATN(); // Correctly retrieving ATN
                int offendingState = nvae.getOffendingState(); // Correct method to get state
                ParserRuleContext parserContext = (ParserRuleContext) recognizer.getContext(); // Fixed variable name
                IntervalSet expectedTokens = atn.getExpectedTokens(offendingState, parserContext);

                if (expectedTokens != null && !expectedTokens.isNil()) {
                    List<String> expectedTokenNames = expectedTokens.toList().stream()
                            .map(i -> error.getRecognizer().getVocabulary().getDisplayName(i))
                            .collect(Collectors.toList());

                    for (String expected : expectedTokenNames) {
                        if (expected.startsWith("'") && expected.endsWith("'")) {
                            expected = expected.substring(1, expected.length() - 1);
                        }

                        if (commonMistakes.containsKey(expected)) {
                            suggestions.addAll(commonMistakes.get(expected));
                        } else {
                            suggestions.add("Expected: " + expected);
                        }
                    }
                }
            }
            // Add context-specific suggestions
            addContextSpecificSuggestions(token, error, context, suggestions);
        }

        return suggestions;
    }

    private void addContextSpecificSuggestions(Token token, ShellErrorListener.SyntaxError error, String context, List<String> suggestions) {
        // Check for common syntax patterns in the context
        String lowerContext = context.toLowerCase();

        // Control structures suggestions
        if (lowerContext.contains("if") && !lowerContext.contains("then")) {
            suggestions.add("Missing 'then' keyword after condition in 'if' statement");
            suggestions.add("Proper syntax: if [ condition ]; then");
        }

        if (lowerContext.contains("if") && lowerContext.contains("then") && !lowerContext.contains("fi")) {
            suggestions.add("Missing 'fi' to close 'if' statement");
            suggestions.add("Proper syntax: if [ condition ]; then\n  commands\nfi");
        }

        if (lowerContext.contains("for") && !lowerContext.contains("do")) {
            suggestions.add("Missing 'do' keyword in 'for' loop");
            suggestions.add("Proper syntax: for var in list; do");
        }

        if (lowerContext.contains("while") && !lowerContext.contains("do")) {
            suggestions.add("Missing 'do' keyword in 'while' loop");
            suggestions.add("Proper syntax: while [ condition ]; do");
        }

        if ((lowerContext.contains("for") || lowerContext.contains("while")) &&
                lowerContext.contains("do") && !lowerContext.contains("done")) {
            suggestions.add("Missing 'done' to close loop");
            suggestions.add("Proper syntax: for/while ... do\n  commands\ndone");
        }

        // Check for variable assignment issues
        if (lowerContext.contains("=")) {
            if (lowerContext.matches(".*\\s+=\\s+.*")) {
                suggestions.add("Variable assignments shouldn't have spaces around '='");
                suggestions.add("Correct syntax: variable=value");
            }
        }

        // Check for bracket mismatches
        checkBracketBalance(context, suggestions);

        // Check for redirection or pipe issues
        if (token.getText().equals("|") || token.getText().equals(">") ||
                token.getText().equals(">>") || token.getText().equals("<")) {

            // Check if redirection/pipe is at the end of input
            if (token.getTokenIndex() == error.getRecognizer().getInputStream().size() - 1) {
                suggestions.add("Incomplete command: redirection/pipe with no target");
                if (token.getText().equals("|")) {
                    suggestions.add("Pipes need a command on both sides: command1 | command2");
                } else {
                    suggestions.add("Redirections need a filename: command " + token.getText() + " file");
                }
            }
        }
    }

    private void checkBracketBalance(String context, List<String> suggestions) {
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('[', ']');
        bracketPairs.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (char c : context.toCharArray()) {
            if (bracketPairs.containsKey(c)) {
                stack.push(c);
            } else if (bracketPairs.containsValue(c)) {
                if (stack.isEmpty()) {
                    suggestions.add("Unmatched closing bracket: " + c);
                    return;
                }

                char open = stack.pop();
                if (bracketPairs.get(open) != c) {
                    suggestions.add("Mismatched brackets: " + open + " and " + c);
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            StringBuilder missing = new StringBuilder("Missing closing brackets: ");
            while (!stack.isEmpty()) {
                char open = stack.pop();
                missing.append(bracketPairs.get(open));
            }
            suggestions.add(missing.toString());
        }
    }
}