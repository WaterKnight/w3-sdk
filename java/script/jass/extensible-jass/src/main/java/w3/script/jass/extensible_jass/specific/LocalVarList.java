package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class LocalVarList extends JassNonTerminal {
    public LocalVarList() {
        super("local_var_list");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new StarQuantifier(
                new Sequence(
                    new JassTerminal("LOCAL") {
                        @Override
                        public LexerValue getLexerValue(ParseContext ctx) {
                            return new Keyword("local");
                        }
                    },
                    new VarDeclaration(),
                    new NewLines()
                )
        );
    }
}
