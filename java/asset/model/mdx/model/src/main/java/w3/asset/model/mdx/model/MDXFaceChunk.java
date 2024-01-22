package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXFaceChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("PVTX");
    }

    private List<MDXFace> faces;

    public List<MDXFace> getFaces() {
        return faces;
    }

    public void setFaces(List<MDXFace> faces) {
        this.faces = faces;
    }
}
