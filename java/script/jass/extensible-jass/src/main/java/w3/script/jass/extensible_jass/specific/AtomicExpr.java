package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.Alternative;
import w3.script.jass.extensible_jass.JassNode;
import w3.script.jass.extensible_jass.JassNonTerminal;
import w3.script.jass.extensible_jass.ParseContext;

public class AtomicExpr extends JassNonTerminal {
    public AtomicExpr() {
        super("atomic_expr");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new UnaryOp(),
                new FuncCall(),
                new ArrayRef(),
                new FuncRef(),
                new Id(),
                new Literal()
        );
    }
}
