lexer grammar ShellLexer;

// Keywords
IF              : 'if';
THEN            : 'then';
ELIF            : 'elif';
ELSE            : 'else';
FI              : 'fi';
FOR             : 'for';
IN              : 'in';
WHILE           : 'while';
DO              : 'do';
DONE            : 'done';
CASE            : 'case';
ESAC            : 'esac';
FUNCTION        : 'function';

// Operators
ASSIGN          : '=';
PIPE            : '|';
AND             : '&&';
OR              : '||';
SEMI            : ';';
LESS            : '<';
GREATER         : '>';
APPEND          : '>>';
REDIRECT_ERR    : '2>';
REDIRECT_BOTH   : '&>';

// Brackets
LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACKET        : '[';
RBRACKET        : ']';
DOLLAR_LPAREN   : '$(';
DOUBLE_LBRACKET : '[[';
DOUBLE_RBRACKET : ']]';

// Command terminators
NEWLINE         : '\r'? '\n';

// Common Bash commands
ECHO            : 'echo';
CD              : 'cd';
PWD             : 'pwd';
LS              : 'ls';
MKDIR           : 'mkdir';
RM              : 'rm';
CP              : 'cp';
MV              : 'mv';
GREP            : 'grep';
SED             : 'sed';
CAT             : 'cat';
CHMOD           : 'chmod';
EXPORT          : 'export';
READ            : 'read';
SOURCE          : 'source' | '.';
TEST            : 'test';

// Variable expansion
DOLLAR          : '$';
DOLLAR_LBRACE   : '${';
RBRACE_VAR      : '}';

// Strings
DOUBLE_QUOTE    : '"' -> pushMode(IN_DOUBLE_QUOTE);
SINGLE_QUOTE    : '\'' -> pushMode(IN_SINGLE_QUOTE);
BACKTICK        : '`' -> pushMode(IN_BACKTICK);

// Numbers
NUMBER          : [0-9]+;

// Comments
COMMENT         : '#' ~[\r\n]* -> channel(HIDDEN);

// Identifiers
IDENTIFIER      : [a-zA-Z_][a-zA-Z0-9_]*;

// Arguments and paths
ARGUMENT        : [a-zA-Z0-9_/.+*@?-]+;

// Whitespace
WS              : [ \t]+ -> channel(HIDDEN);

// Skip any other character
OTHER           : . -> skip;

// Double quoted string mode
mode IN_DOUBLE_QUOTE;
DOUBLE_QUOTE_CONTENT : ~["\\\r\n$]+ | '\\' . | '$';
DOUBLE_QUOTE_ESCAPE  : '\\' .;
DOUBLE_QUOTE_DOLLAR  : '$' -> type(DOLLAR);
DOUBLE_QUOTE_END     : '"' -> type(DOUBLE_QUOTE), popMode;

// Single quoted string mode
mode IN_SINGLE_QUOTE;
SINGLE_QUOTE_CONTENT : ~['\r\n]+;
SINGLE_QUOTE_END     : '\'' -> type(SINGLE_QUOTE), popMode;

// Backtick mode
mode IN_BACKTICK;
BACKTICK_CONTENT : ~[`\r\n]+;
BACKTICK_END     : '`' -> type(BACKTICK), popMode;