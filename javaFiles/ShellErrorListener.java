import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import java.util.*;

public class ShellErrorListener extends BaseErrorListener {
    private List<SyntaxError> syntaxErrors = new ArrayList<>();
    private final SuggestionEngine suggestionEngine;

    public ShellErrorListener(SuggestionEngine suggestionEngine) {
        this.suggestionEngine = suggestionEngine;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        SyntaxError error = new SyntaxError(
                recognizer,
                offendingSymbol,
                line,
                charPositionInLine,
                msg,
                e
        );

        syntaxErrors.add(error);

        // Get error context and suggestion
        String errorContext = getErrorContext(recognizer, offendingSymbol);
        List<String> suggestions = suggestionEngine.getSuggestions(error, errorContext);

        // Print error with suggestions
        System.err.println(formatError(error, errorContext, suggestions));
    }

    private String getErrorContext(Recognizer<?, ?> recognizer, Object offendingSymbol) {
        if (recognizer instanceof Parser) {
            Parser parser = (Parser) recognizer;
            TokenStream tokens = parser.getInputStream();

            if (offendingSymbol instanceof Token) {
                Token offendingToken = (Token) offendingSymbol;
                int start = Math.max(0, offendingToken.getTokenIndex() - 5);
                int stop = Math.min(tokens.size() - 1, offendingToken.getTokenIndex() + 5);

                return tokens.getText(new Interval(start, stop));
            }
        }

        return "";
    }

    private String formatError(SyntaxError error, String context, List<String> suggestions) {
        StringBuilder sb = new StringBuilder();
        sb.append("Line ").append(error.getLine())
                .append(":").append(error.getCharPositionInLine())
                .append(" - ").append(error.getMessage())
                .append("\n");

        sb.append("Context: \"").append(context).append("\"\n");

        if (!suggestions.isEmpty()) {
            sb.append("Suggestions:\n");
            for (String suggestion : suggestions) {
                sb.append("  - ").append(suggestion).append("\n");
            }
        }

        return sb.toString();
    }

    public List<SyntaxError> getSyntaxErrors() {
        return syntaxErrors;
    }

    public static class SyntaxError {
        private final Recognizer<?, ?> recognizer;
        private final Object offendingSymbol;
        private final int line;
        private final int charPositionInLine;
        private final String message;
        private final RecognitionException exception;

        public SyntaxError(
                Recognizer<?, ?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String message,
                RecognitionException exception) {

            this.recognizer = recognizer;
            this.offendingSymbol = offendingSymbol;
            this.line = line;
            this.charPositionInLine = charPositionInLine;
            this.message = message;
            this.exception = exception;
        }

        public Recognizer<?, ?> getRecognizer() { return recognizer; }
        public Object getOffendingSymbol() { return offendingSymbol; }
        public int getLine() { return line; }
        public int getCharPositionInLine() { return charPositionInLine; }
        public String getMessage() { return message; }
        public RecognitionException getException() { return exception; }
    }
}