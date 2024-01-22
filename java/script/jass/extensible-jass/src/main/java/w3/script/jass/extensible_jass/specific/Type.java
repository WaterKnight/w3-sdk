package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.Alternative;
import w3.script.jass.extensible_jass.JassNode;
import w3.script.jass.extensible_jass.JassNonTerminal;
import w3.script.jass.extensible_jass.ParseContext;

import java.util.Arrays;
import java.util.List;

public class Type extends JassNonTerminal {
    public Type() {
        super("type");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new Id(),
                new CodeType(),
                new HandleType(),
                new IntegerType(),
                new RealType(),
                new BooleanType(),
                new StringType()
        );
    }
}
