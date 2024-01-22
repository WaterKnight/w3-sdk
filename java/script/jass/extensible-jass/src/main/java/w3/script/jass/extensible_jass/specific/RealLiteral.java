package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class RealLiteral extends JassTerminal {
    public RealLiteral() {
        super("REAL");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("([0-9]+ '.' [0-9]*) | ('.' [0-9]+)");
    }
}
