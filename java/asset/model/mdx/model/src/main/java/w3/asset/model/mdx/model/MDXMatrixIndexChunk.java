package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXMatrixIndexChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("MATS");
    }

    private List<MDXMatrixIndex> matrixIndices;

    public List<MDXMatrixIndex> getMatrixIndices() {
        return matrixIndices;
    }

    public void setMatrixIndices(List<MDXMatrixIndex> matrixIndices) {
        this.matrixIndices = matrixIndices;
    }
}
