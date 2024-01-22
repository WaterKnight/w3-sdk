package w3.asset.model.mdx.model;

import w3.common.core.Id;

public class MDXVersionChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("VERS");
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
