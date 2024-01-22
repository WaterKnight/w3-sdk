package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXFaceGroupChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("PCNT");
    }

    private List<MDXFaceGroup> faceGroups;

    public List<MDXFaceGroup> getFaceGroups() {
        return faceGroups;
    }

    public void setFaceGroups(List<MDXFaceGroup> faceGroups) {
        this.faceGroups = faceGroups;
    }
}
