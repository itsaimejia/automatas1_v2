grammar telefono;

inicio      : record+;
record      : (telefono | error ) PUNTOCOMA;
error       : PALERROR* NUMERROR* GUION* PALERROR* DOSNUM*;
telefono    : lada cuerpo ;
lada        : ABRIR (TRESNUM | SEIS) CERRAR?;
cuerpo      : TRESNUM? GUION DOSNUM GUION DOSNUM;


SEIS        : TRESNUM TRESNUM;
TRESNUM     : DIGITO DIGITO DIGITO;
DOSNUM      : DIGITO DIGITO; 
ABRIR       : '(';
CERRAR      : ')';
GUION       : '-';
PUNTOCOMA   : ';';
PALERROR    : [a-zA-Z]+;
NUMERROR    : DIGITO+;

fragment 
DIGITO      : [0-9];


WS          : [ \r\n\t] -> skip;