package w3.asset.model.mdx.model;

import java.util.List;

public class MDXMaterial {
    private long priorityPlane;
    private long flags;
    private List<MDXLayer> layers;

    public long getPriorityPlane() {
        return priorityPlane;
    }

    public void setPriorityPlane(long priorityPlane) {
        this.priorityPlane = priorityPlane;
    }

    public long getFlags() {
        return flags;
    }

    public void setFlags(long flags) {
        this.flags = flags;
    }

    public List<MDXLayer> getLayers() {
        return layers;
    }

    public void setLayers(List<MDXLayer> layers) {
        this.layers = layers;
    }
}
