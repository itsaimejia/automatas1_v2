grammar ip;

ips     : ip+;
ip      : config DOT config DOT config DOT config;
config  : GOTO199 | GOTO249 | GOTO255;

GOTO199 : '1'? DECIMAL? DECIMAL;
GOTO249 : '2' [0-4] DECIMAL;
GOTO255 : '25' [0-5]; 
DOT     : '.';
 

fragment 
DECIMAL : [0-9];


SPACE   : [ \t\r\n] -> skip;