package w3.asset.model.mdx.model;

import java.util.List;

public class MDXCollisionShape {
    private MDXNode node;

    private List<MDXVertex> vertices;

    private Type type;

    public MDXNode getNode() {
        return node;
    }

    public void setNode(MDXNode node) {
        this.node = node;
    }

    public List<MDXVertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<MDXVertex> vertices) {
        this.vertices = vertices;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        CUBE,
        PLANE,
        SPHERE,
        CYLINDER
    }
}
