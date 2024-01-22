grammar txt;
COMMENT: '//' ~[\n\r]*;
NL: [\n\r]+;
STR: (~[\n\r[\]=,"]+ '[' ~[\n\r[\]=,"]+ ']') | ~[\n\r[\]=,"]+ | '"' (~["\n\r]+ '"'?)?;
COMMA: ',' -> skip;
WS: [\t ]+;
block: '[' category=STR ']' (NL (COMMENT NL)* lines+=line)*;
line: key=STR '=' values+=STR* WS*;
root: WS* ((NL | COMMENT)* lines+=line)* ((NL | COMMENT)* block)* (WS | NL | COMMENT)*;