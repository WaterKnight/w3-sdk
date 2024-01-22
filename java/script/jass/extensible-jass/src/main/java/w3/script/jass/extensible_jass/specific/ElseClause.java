package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class ElseClause extends JassNonTerminal {
    public ElseClause() {
        super("else_clause");
    }

    public final static JassTerminal ELSE = new JassTerminal("ELSE") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("else");
        }
    };

    public final static JassTerminal ELSEIF = new JassTerminal("ELSEIF") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("elseif");
        }
    };

    public final static JassTerminal THEN = new JassTerminal("THEN") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("then");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new Sequence(
                        ELSE,
                        new PlusQuantifier(new NewLines()),
                        new StatementList()
                ),
                new Sequence(
                        ELSEIF,
                        new Expr(),
                        THEN,
                        new PlusQuantifier(new NewLines()),
                        new StatementList(),
                        new OptionalQuantifier(new ElseClause())
                )
        );
    }
}
