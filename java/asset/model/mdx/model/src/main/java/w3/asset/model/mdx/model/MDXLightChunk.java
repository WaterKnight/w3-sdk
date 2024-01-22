package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("LITE");
    }

    private List<MDXLight> lights;

    public List<MDXLight> getLights() {
        return lights;
    }

    public void setLights(List<MDXLight> lights) {
        this.lights = lights;
    }
}
