package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXMatrixGroupChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("MTGC");
    }

    private List<MDXMatrixGroup> matrixGroups;

    public List<MDXMatrixGroup> getMatrixGroups() {
        return matrixGroups;
    }

    public void setMatrixGroups(List<MDXMatrixGroup> matrixGroups) {
        this.matrixGroups = matrixGroups;
    }
}
