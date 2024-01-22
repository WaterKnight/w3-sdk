package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class HexIntLiteral extends JassTerminal {
    public HexIntLiteral() {
        super("HEX_INT");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("(('0' [xX]) | '$') [0-9a-fA-F]+");
    }
}
