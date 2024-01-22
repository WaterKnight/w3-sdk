package w3.script.jass.extensible_jass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class OptionalQuantifier extends JassNonTerminal {
    private final JassNode content;

    public JassNode getContent() {
        return content;
    }

    public OptionalQuantifier(JassNode content) {
        super("meta_optional");
        this.content = content;
    }

    @Override
    public JassNode getContent(ParseContext ctx) {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OptionalQuantifier that = (OptionalQuantifier) o;
        return Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }
}
