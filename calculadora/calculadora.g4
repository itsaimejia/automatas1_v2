grammar calculadora;

initial    : option+;
option  : (oper | VAR EQU oper) NLINE | NLINE;
oper    : oper SIG oper | NUM | VAR | OPEN oper CLOSE;

SIG     : '+'| '-' | '*' | '/';
OPEN    : '(';
CLOSE   : ')';
EQU     : '=';

NUM     : [0-9]+;
VAR     : [a-zA-Z]+;

NLINE   : [\n];

WS      : [ \r\t]->skip;


