package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXSequenceChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("SEQS");
    }

    private List<MDXSequence> sequences;

    public List<MDXSequence> getSequences() {
        return sequences;
    }

    public void setSequences(List<MDXSequence> sequences) {
        this.sequences = sequences;
    }
}
