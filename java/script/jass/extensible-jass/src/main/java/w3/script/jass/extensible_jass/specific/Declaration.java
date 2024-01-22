package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class Declaration extends JassNonTerminal {
    public Declaration() {
        super("declaration");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new TypeDef(),
                new Globals(),
                new NativeFunc(),
                new Func()
        );
    }
}
