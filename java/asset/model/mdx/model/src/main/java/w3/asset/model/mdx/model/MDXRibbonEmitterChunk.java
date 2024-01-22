package w3.asset.model.mdx.model;

import w3.asset.model.mdx.api.MDXChunk;
import w3.common.core.Id;

public class MDXRibbonEmitterChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("RIBB");
    }
}
