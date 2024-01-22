grammar AntlrWTS;
COMMENT: '//' ~[\n\r]*;
WS: [\t ]+;
NL: [\n\r]+ -> skip;
STR: '{' NL* ~[}]+ NL* '}';
INT: [0-9]+;
block: 'STRING' WS+ (num=INT) NL* COMMENT* NL* (str=STR);
root: (WS | NL)* block* (WS | NL)*;