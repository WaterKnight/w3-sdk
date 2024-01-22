// Define a grammar called SLK
grammar Slk;

options {
	language = Java;
}

@header {
	package w3.common.slk.impl.antlr;
}

RECORD_PART: ~('\n' | '\r' | ';')+;

fragment STRING_UNQUOTED:
    ( EscapeSequence | ~('"'|'\r'|'\n'|';') )+;

fragment STRING_QUOTED:
	'"' ( EscapeSequence | ~('"'|'\r'|'\n') | NEW_LINE )* '"';

fragment EscapeSequence: '\\' [abfnrtvz"'\\];

SEP:
    ';';
NEW_LINE:
	('\r\n' | '\n' | '\r')+ ;
WS:
	(' ' | '\t')+ -> skip ;

root:
    records+=record (NEW_LINE+ records+=record)*
    NEW_LINE*
    ;

record:
    type=RECORD_PART (SEP recordPart?)*;

recordPart:
    RECORD_PART;