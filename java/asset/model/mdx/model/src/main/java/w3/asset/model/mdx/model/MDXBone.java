package w3.asset.model.mdx.model;

public class MDXBone {
    private MDXNode node;
    private long geosetId;
    private long geosetAnimId;

    public MDXNode getNode() {
        return node;
    }

    public void setNode(MDXNode node) {
        this.node = node;
    }

    public long getGeosetId() {
        return geosetId;
    }

    public void setGeosetId(long geosetId) {
        this.geosetId = geosetId;
    }

    public long getGeosetAnimId() {
        return geosetAnimId;
    }

    public void setGeosetAnimId(long geosetAnimId) {
        this.geosetAnimId = geosetAnimId;
    }
}
