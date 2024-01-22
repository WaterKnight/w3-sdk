package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXMaterialChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("MTLS");
    }

    private List<MDXMaterial> materials;

    public List<MDXMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(List<MDXMaterial> materials) {
        this.materials = materials;
    }
}
