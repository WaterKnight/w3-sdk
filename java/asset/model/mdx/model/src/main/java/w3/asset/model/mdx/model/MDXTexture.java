package w3.asset.model.mdx.model;

public class MDXTexture {
    private long replaceableId;
    private String fileName;
    private long flags;

    public long getReplaceableId() {
        return replaceableId;
    }

    public void setReplaceableId(long replaceableId) {
        this.replaceableId = replaceableId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFlags() {
        return flags;
    }

    public void setFlags(long flags) {
        this.flags = flags;
    }
}
