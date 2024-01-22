package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class Id extends JassTerminal {
    public Id() {
        super("ID");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("[a-zA-Z]([a-zA-Z0-9_]* [a-zA-Z0-9])?");
    }
}
