package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class IfThenElse extends JassNonTerminal {
    public IfThenElse() {
        super("if_then_else");
    }

    public final static JassTerminal IF = new JassTerminal("IF") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("if");
        }
    };

    public final static JassTerminal THEN = new JassTerminal("THEN") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("then");
        }
    };

    public final static JassTerminal ENDIF = new JassTerminal("ENDIF") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("endif");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                IF,
                new Expr(),
                THEN,
                new PlusQuantifier(new NewLines()),
                new StatementList(),
                new StarQuantifier(new ElseIfClause()),
                new OptionalQuantifier(new ElseClause()),
                ENDIF

        );
    }
}
