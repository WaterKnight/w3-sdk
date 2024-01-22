package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.Keyword;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class EqualityOp extends JassTerminal {
    public EqualityOp() {
        super("EQUAL_OP");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new Keyword( "==");
    }
}
