package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class IdIntLiteral extends JassTerminal {
    public IdIntLiteral() {
        super("ID_INT");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("'([\\u0000-\\u0026\\u0028-\\u00FF]+)'");
    }
}
