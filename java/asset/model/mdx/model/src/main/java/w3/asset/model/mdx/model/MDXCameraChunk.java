package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXCameraChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("CAMS");
    }

    private List<MDXCamera> cameras;

    public List<MDXCamera> getCameras() {
        return cameras;
    }

    public void setCameras(List<MDXCamera> cameras) {
        this.cameras = cameras;
    }
}
