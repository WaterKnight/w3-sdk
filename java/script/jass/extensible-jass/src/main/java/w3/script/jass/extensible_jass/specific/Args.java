package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class Args extends JassNonTerminal {
    public Args() {
        super("args");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new Expr(),
                new StarQuantifier(
                        new JassNonTerminal("args_tail") {
                            @Override
                            public JassNode getContent(ParseContext ctx) {
                                return new Sequence(
                                        new Comma(),
                                        new Expr()
                                );
                            }
                        }
                )
        );
    }
}
