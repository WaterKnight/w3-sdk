package w3.script.jass.extensible_jass;

import java.util.Objects;

public abstract class JassTerminal implements JassNode {
    private final String name;

    public String getName() {
        return name;
    }

    public JassTerminal(String name) {
        this.name = name;
    }

    public abstract LexerValue getLexerValue(ParseContext ctx);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JassTerminal that = (JassTerminal) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
