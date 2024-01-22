package w3.script.jass.extensible_jass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class JassNonTerminal implements JassNode {
    private final String name;

    @Override
    public String getName() {
        return name;
    }

    public JassNonTerminal(String name) {
        this.name = name;
    }

    public abstract JassNode getContent(ParseContext ctx);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JassNonTerminal that = (JassNonTerminal) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
