package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class ElseIfClause extends JassNonTerminal {
    public ElseIfClause() {
        super("else_if_clause");
    }

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
        return new Sequence(
                ELSEIF,
                new Expr(),
                THEN,
                new PlusQuantifier(new NewLines()),
                new StatementList()
        );
    }
}
