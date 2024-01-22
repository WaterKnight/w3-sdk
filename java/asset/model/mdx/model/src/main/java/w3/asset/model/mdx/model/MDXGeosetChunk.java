package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXGeosetChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("GEOS");
    }

    private List<MDXGeoset> geosets;

    public List<MDXGeoset> getGeosets() {
        return geosets;
    }

    public void setGeosets(List<MDXGeoset> geosets) {
        this.geosets = geosets;
    }
}
