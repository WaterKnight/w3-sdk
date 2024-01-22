package w3.asset.model.mdx.model;

import java.util.List;

public class MDXAttachment {
    private MDXNode node;

    public MDXNode getNode() {
        return node;
    }

    public void setNode(MDXNode node) {
        this.node = node;
    }

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private long attachmentId;

    public long getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(long attachmentId) {
        this.attachmentId = attachmentId;
    }

    private List<MDXAttachmentVisibilityTrackChunk> visibilityTrackChunks;

    public List<MDXAttachmentVisibilityTrackChunk> getVisibilityTrackChunks() {
        return visibilityTrackChunks;
    }

    public void setVisibilityTrackChunks(List<MDXAttachmentVisibilityTrackChunk> visibilityTrackChunks) {
        this.visibilityTrackChunks = visibilityTrackChunks;
    }
}
