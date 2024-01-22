package w3.asset.model.mdx.model;

import w3.common.core.Id;

public class MDXModelInfoChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("MODL");
    }

    private String name;

    private String animFileName;

    private MDXExtent extent;

    private long blendTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimFileName() {
        return animFileName;
    }

    public void setAnimFileName(String animFileName) {
        this.animFileName = animFileName;
    }

    public MDXExtent getExtent() {
        return extent;
    }

    public void setExtent(MDXExtent extent) {
        this.extent = extent;
    }

    public long getBlendTime() {
        return blendTime;
    }

    public void setBlendTime(long blendTime) {
        this.blendTime = blendTime;
    }
}
