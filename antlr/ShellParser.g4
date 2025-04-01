parser grammar ShellParser;

options { tokenVocab = ShellLexer; }

// Top level rule
script
    : (complete_command)* EOF
    ;

complete_command
    : list (NEWLINE | SEMI | EOF)
    ;

list
    : list_item ((AND | OR) list_item)*
    ;

list_item
    : pipeline
    ;

pipeline
    : pipeline_item (PIPE pipeline_item)*
    ;

pipeline_item
    : command
    ;

command
    : simple_command
    | compound_command
    | function_definition
    | variable_assignment
    ;

simple_command
    : cmd_prefix? cmd_name cmd_suffix?
    ;

cmd_name
    : IDENTIFIER
    | ECHO | CD | PWD | LS | MKDIR | RM | CP | MV | GREP | SED | CAT | CHMOD | EXPORT | READ | SOURCE | TEST
    ;

cmd_prefix
    : (redirect)+
    ;

cmd_suffix
    : (ARGUMENT | redirect)+
    ;

redirect
    : LESS ARGUMENT
    | GREATER ARGUMENT
    | APPEND ARGUMENT
    | REDIRECT_ERR ARGUMENT
    | REDIRECT_BOTH ARGUMENT
    ;

compound_command
    : if_statement
    | while_loop
    | for_loop
    | case_statement
    | brace_group
    | subshell
    ;

if_statement
    : IF list NEWLINE* THEN NEWLINE* list_sequence elif_part* else_part? NEWLINE* FI
    ;

elif_part
    : ELIF list NEWLINE* THEN NEWLINE* list_sequence
    ;

else_part
    : ELSE NEWLINE* list_sequence
    ;

while_loop
    : WHILE list NEWLINE* DO NEWLINE* list_sequence NEWLINE* DONE
    ;

for_loop
    : FOR IDENTIFIER (IN argument_list)? NEWLINE* DO NEWLINE* list_sequence NEWLINE* DONE
    ;

case_statement
    : CASE ARGUMENT NEWLINE* IN NEWLINE* case_item* ESAC
    ;

case_item
    : pattern_list RPAREN NEWLINE* list_sequence SEMI? NEWLINE*
    ;

pattern_list
    : ARGUMENT (PIPE ARGUMENT)*
    ;

brace_group
    : LBRACE NEWLINE* list_sequence NEWLINE* RBRACE
    ;

subshell
    : LPAREN NEWLINE* list_sequence NEWLINE* RPAREN
    ;

function_definition
    : (FUNCTION IDENTIFIER | IDENTIFIER LPAREN RPAREN) NEWLINE* function_body
    ;

function_body
    : brace_group
    | compound_command
    ;

variable_assignment
    : IDENTIFIER ASSIGN (ARGUMENT | SINGLE_QUOTE SINGLE_QUOTE_CONTENT? SINGLE_QUOTE | DOUBLE_QUOTE DOUBLE_QUOTE_CONTENT? DOUBLE_QUOTE)
    ;

// Helper rule for sequences of lists that can be separated by newlines or semicolons
list_sequence
    : list? (separator list?)*
    ;

separator
    : NEWLINE+
    | SEMI NEWLINE*
    ;

argument_list
    : ARGUMENT+
    ;