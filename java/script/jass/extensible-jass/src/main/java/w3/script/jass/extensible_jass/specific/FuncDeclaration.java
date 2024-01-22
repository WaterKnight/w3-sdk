package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class FuncDeclaration extends JassNonTerminal {
    public FuncDeclaration() {
        super("func_declaration");
    }

    public final static JassTerminal TAKES = new JassTerminal("TAKES") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("takes");
        }
    };

    public final static JassTerminal NOTHING = new JassTerminal("NOTHING") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("nothing");
        }
    };

    public final static JassTerminal RETURNS = new JassTerminal("RETURNS") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("returns");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new Id(),
                TAKES,
                new Alternative(
                        NOTHING,
                        new ParamList()
                ),
                RETURNS,
                new Alternative(
                        new Type(),
                        NOTHING
                )
        );
    }
}
