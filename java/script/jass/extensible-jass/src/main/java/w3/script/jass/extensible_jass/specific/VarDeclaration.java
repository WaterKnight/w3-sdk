package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class VarDeclaration extends JassNonTerminal {
    public VarDeclaration() {
        super("var_declaration");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new Sequence(
                        new Type(),
                        new Id(),
                        new OptionalQuantifier(
                                new Sequence(
                                    new JassTerminal("ASSIGN") {
                                        @Override
                                        public LexerValue getLexerValue(ParseContext ctx) {
                                            return new Keyword("=");
                                        }
                                    },
                                    new Expr()
                                )
                        )
                ),
                new Sequence(
                        new Type(),
                        new JassTerminal("ARRAY") {
                            @Override
                            public LexerValue getLexerValue(ParseContext ctx) {
                                return new Keyword("array");
                            }
                        },
                        new Id()
                )
        );
    }
}
