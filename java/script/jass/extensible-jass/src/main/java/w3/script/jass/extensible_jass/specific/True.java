package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.Keyword;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class True extends JassTerminal {
    public True() {
        super("TRUE");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new Keyword( "true");
    }
}
