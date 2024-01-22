package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassTerminal;
import w3.script.jass.extensible_jass.LexerValue;
import w3.script.jass.extensible_jass.ParseContext;

public class CommentBlock extends JassTerminal {
    public CommentBlock() {
        super("COMMENT_BLOCK");
    }

    @Override
    public LexerValue getLexerValue(ParseContext ctx) {
        return new LexerValue("'/*' (~('*') | ('*' + ~('/')))* '*/'");
    }
}
