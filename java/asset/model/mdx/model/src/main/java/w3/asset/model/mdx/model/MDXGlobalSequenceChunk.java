package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXGlobalSequenceChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("GLBS");
    }

    private List<MDXGlobalSequence> globalSequences;

    public List<MDXGlobalSequence> getGlobalSequences() {
        return globalSequences;
    }

    public void setGlobalSequences(List<MDXGlobalSequence> globalSequences) {
        this.globalSequences = globalSequences;
    }
}
