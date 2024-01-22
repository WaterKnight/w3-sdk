package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class Literal extends JassNonTerminal {
    public Literal() {
        super("literal");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new IntLiteral(),
                new RealLiteral(),
                new BoolLiteral(),
                new StringLiteral(),
                new NullLiteral()
        );
    }
}
