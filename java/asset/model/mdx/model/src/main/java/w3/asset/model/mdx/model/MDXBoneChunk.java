package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXBoneChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("BONE");
    }

    private List<MDXBone> bones;

    public List<MDXBone> getBones() {
        return bones;
    }

    public void setBones(List<MDXBone> bones) {
        this.bones = bones;
    }
}
