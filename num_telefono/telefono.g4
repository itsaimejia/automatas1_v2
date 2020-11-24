grammar telefono;

telefonos   : telefono+;
telefono    : ABRIR DIGITO DIGITO DIGITO CERRAR ESPACIO DIGITO DIGITO DIGITO GUION DIGITO DIGITO GUION DIGITO DIGITO;

ABRIR       : '(';
CERRAR      : ')';
GUION       : '-';
ESPACIO     : ' ';
DIGITO      : [0-9];

WS          : [\r\n\t] -> skip;