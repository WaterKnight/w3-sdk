package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class Set extends JassNonTerminal {
    public Set() {
        super("set");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new Sequence(
                        new JassTerminal("SET") {
                            @Override
                            public LexerValue getLexerValue(ParseContext ctx) {
                                return new Keyword("set");
                            }
                        },
                        new Id(),
                        new JassTerminal("ASSIGN") {
                            @Override
                            public LexerValue getLexerValue(ParseContext ctx) {
                                return new Keyword("=");
                            }
                        },
                        new Expr()
                ),
                new Sequence(
                        new JassTerminal("SET") {
                            @Override
                            public LexerValue getLexerValue(ParseContext ctx) {
                                return new Keyword("set");
                            }
                        },
                        new Id(),
                        new BracketLeft(),
                        new Expr(),
                        new BracketRight(),
                        new JassTerminal("ASSIGN") {
                            @Override
                            public LexerValue getLexerValue(ParseContext ctx) {
                                return new Keyword("=");
                            }
                        },
                        new Expr()
                )
        );
    }
}
