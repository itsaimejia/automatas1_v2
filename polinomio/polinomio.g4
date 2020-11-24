grammar polinomio;

polinomio   : NUM EXIS POTENCIA DOS MAS NUM EXIS MAS NUM;

EXIS        : 'x';
POTENCIA    : '^';
DOS         : '2';
MAS         : '+';
NUM         : [0-9]+;