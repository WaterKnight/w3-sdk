package w3.asset.model.mdx.model;

import w3.common.core.Id;

public class LayersChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("LAYS");
    }
}