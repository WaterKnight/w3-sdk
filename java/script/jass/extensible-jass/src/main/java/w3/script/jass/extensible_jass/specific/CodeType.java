package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.Keyword;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class CodeType extends JassTerminal {
    public CodeType() {
        super("CODE_TYPE");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new Keyword( "code");
    }
}
