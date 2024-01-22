package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Call extends JassNonTerminal {
    public Call() {
        super("call");
    }

    public final static JassTerminal CALL = new JassTerminal("CALL") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("call");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                CALL,
                new FuncCall()
        );
    }
}
