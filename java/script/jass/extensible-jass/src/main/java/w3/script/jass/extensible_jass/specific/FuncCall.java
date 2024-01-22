package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class FuncCall extends JassNonTerminal {
    public FuncCall() {
        super("func_call");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(new Id(), new ParensLeft(), new OptionalQuantifier(new Args()), new ParensRight());
    }
}
