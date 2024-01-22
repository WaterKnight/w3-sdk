package w3.script.jass.extensible_jass.specific;

import w3.script.jass.extensible_jass.*;

import java.util.Arrays;
import java.util.List;

public class File extends JassNonTerminal {
    public File() {
        super("file");
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return new Sequence(
                new NewLines(),
                new StarQuantifier(
                        new Sequence(
                            new Declaration(),
                            new NewLines()
                        )
                ),
                new StarQuantifier(
                        new Func()
                ),
                new OptionalQuantifier(new NewLines())
        );
    }
}
