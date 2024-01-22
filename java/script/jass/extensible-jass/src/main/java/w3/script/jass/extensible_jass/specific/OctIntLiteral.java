package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class OctIntLiteral extends JassTerminal {
    public OctIntLiteral() {
        super("OCT_INT");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("'0' [0-7]*");
    }
}
