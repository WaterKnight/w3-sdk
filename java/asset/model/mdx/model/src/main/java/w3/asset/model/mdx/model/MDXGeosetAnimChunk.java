package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXGeosetAnimChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("GEOA");
    }

    private List<MDXGeosetAnim> geosetAnims;

    public List<MDXGeosetAnim> getGeosetAnims() {
        return geosetAnims;
    }

    public void setGeosetAnims(List<MDXGeosetAnim> geosetAnims) {
        this.geosetAnims = geosetAnims;
    }
}
