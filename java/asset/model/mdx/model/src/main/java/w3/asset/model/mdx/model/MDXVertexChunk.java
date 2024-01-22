package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXVertexChunk implements MDXChunk {

    @Override
    public Id getToken() {
        return Id.valueOf("VRTX");
    }

    private List<MDXVertex> vertices;

    public List<MDXVertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<MDXVertex> vertices) {
        this.vertices = vertices;
    }
}
