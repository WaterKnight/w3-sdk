package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class StringLiteral extends JassTerminal {
    public static String ESCAPE_SEQUENCE = "'\\\\' [abfnrtvz\"'\\\\]";

    public StringLiteral() {
        super("STRING_LITERAL");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("'\"' ( " + ESCAPE_SEQUENCE + " | ~('\\\\'|'\"'|'\\r'|'\\n') | NEW_LINES )* '\"'");
    }
}
