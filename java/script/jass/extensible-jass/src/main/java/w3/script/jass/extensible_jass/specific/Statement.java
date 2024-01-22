package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.Alternative;
import w3.script.jass.extensible_jass.JassNode;
import w3.script.jass.extensible_jass.JassNonTerminal;
import w3.script.jass.extensible_jass.ParseContext;

public class Statement extends JassNonTerminal {
    public Statement() {
        super("statement");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Alternative(
                new Set(),
                new Call(),
                new IfThenElse(),
                new Loop(),
                new Exitwhen(),
                new Return(),
                new Debug(),
                new Select()
        );
    }
}
