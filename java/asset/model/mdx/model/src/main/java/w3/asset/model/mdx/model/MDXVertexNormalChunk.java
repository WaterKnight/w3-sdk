package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXVertexNormalChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("NRMS");
    }

    private List<MDXVertex> vertices;

    public List<MDXVertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<MDXVertex> vertices) {
        this.vertices = vertices;
    }
}
