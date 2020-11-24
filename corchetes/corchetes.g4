grammar corchetes;

inicio      : compuesto+;

multicomp   : compuesto  (COMA compuesto)+?;      
compuesto   : OPEN base? CLOSE;
base        : (NUMBER  (COMA (NUMBER | compuesto))*? | compuesto)+;


OPEN    : '[';
CLOSE   : ']';
NUMBER  : [0-9]+;
COMA    : ','; 


WS      :[ \t\n\r]->skip;