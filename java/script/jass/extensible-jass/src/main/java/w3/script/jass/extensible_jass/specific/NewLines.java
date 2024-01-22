package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class NewLines extends JassTerminal {
    public NewLines() {
        super("NEW_LINES");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("('\\r\\n' | '\\n' | '\\r')+");
    }
}
