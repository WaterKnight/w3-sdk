package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Debug extends JassNonTerminal {
    public Debug() {
        super("debug");
    }

    public final static JassTerminal DEBUG = new JassTerminal("DEBUG") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("debug");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                DEBUG,
                new Statement()
        );
    }
}
