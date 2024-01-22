package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.JassNode;
import w3.script.jass.extensible_jass.JassNonTerminal;
import w3.script.jass.extensible_jass.ParseContext;
import w3.script.jass.extensible_jass.Sequence;

import java.util.Arrays;
import java.util.List;

public class ArrayRef extends JassNonTerminal {
    public ArrayRef() {
        super("array_ref");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new Id(),
                new BracketLeft(),
                new Expr(),
                new BracketRight()
        );
    }
}
