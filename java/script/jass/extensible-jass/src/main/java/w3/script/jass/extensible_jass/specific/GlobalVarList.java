package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class GlobalVarList extends JassNonTerminal {
    public GlobalVarList() {
        super("global_var_list");
    }

    public static JassTerminal ARRAY = new JassTerminal("ARRAY") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("array");
        }
    };

    public static JassTerminal ASSIGN = new JassTerminal("ASSIGN") {
        @Override
        public LexerValue getLexerValue(ParseContext ctx) {
            return new Keyword("=");
        }
    };

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new StarQuantifier(
                new Alternative(
                        new Sequence(
                                new JassTerminal("CONSTANT") {
                                    @Override
                                    public LexerValue getLexerValue(ParseContext ctx) {
                                        return new Keyword("constant");
                                    }
                                },
                                new Type(),
                                new OptionalQuantifier(
                                        ARRAY
                                ),
                                new Id(),
                                ASSIGN,
                                new Expr(),
                                new NewLines()
                        ),
                        new Sequence(
                                new VarDeclaration(),
                                new NewLines()
                        )
                )
        );
    }
}
