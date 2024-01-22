package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

public class TypeDef extends JassNonTerminal {
    public TypeDef() {
        super("typedef");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new JassTerminal("TYPE") {
                    @Override
                    public LexerValue getLexerValue(ParseContext ctx) {
                        return new Keyword("type");
                    }
                },
                new Id(),
                new JassTerminal("EXTENDS") {
                    @Override
                    public LexerValue getLexerValue(ParseContext ctx) {
                        return new Keyword("extends");
                    }
                },
                new Alternative(
                        new HandleType(),
                        new Id()
                )
        );
    }
}
