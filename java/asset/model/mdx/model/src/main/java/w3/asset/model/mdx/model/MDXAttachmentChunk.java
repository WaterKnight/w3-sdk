package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXAttachmentChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("ATCH");
    }

    private List<MDXAttachment> attachments;

    public List<MDXAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<MDXAttachment> attachments) {
        this.attachments = attachments;
    }
}
