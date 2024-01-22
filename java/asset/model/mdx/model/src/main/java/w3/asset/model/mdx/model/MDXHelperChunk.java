package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXHelperChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("HELP");
    }

    private List<MDXHelper> helpers;

    public List<MDXHelper> getHelpers() {
        return helpers;
    }

    public void setHelpers(List<MDXHelper> helpers) {
        this.helpers = helpers;
    }
}
