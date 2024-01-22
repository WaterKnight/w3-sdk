package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Exitwhen extends JassNonTerminal {
    public Exitwhen() {
        super("exitwhen");
    }

    public final static JassTerminal EXITWHEN = new JassTerminal("EXITWHEN") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("exitwhen");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                EXITWHEN,
                new OptionalQuantifier(new Expr())
        );
    }
}
