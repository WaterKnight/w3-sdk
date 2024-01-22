package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class CommentSingle extends JassTerminal {
    public CommentSingle() {
        super("COMMENT_SINGLE");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("'//' (~('\\n'|'\\r'))*");
    }
}
