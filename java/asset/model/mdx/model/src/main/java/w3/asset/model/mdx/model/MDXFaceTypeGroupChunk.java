package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXFaceTypeGroupChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("PTYP");
    }

    private List<MDXFaceTypeGroup> faceTypeGroups;

    public List<MDXFaceTypeGroup> getFaceTypeGroups() {
        return faceTypeGroups;
    }

    public void setFaceTypeGroups(List<MDXFaceTypeGroup> faceTypeGroups) {
        this.faceTypeGroups = faceTypeGroups;
    }
}
