package w3.asset.model.mdx.model;

import java.util.List;

public class MDXParticleEmitter {
    private MDXNode node;
    private float emissionRate;
    private float gravity;
    private float longitude;
    private float latitude;
    private String fileName;
    private float lifespan;
    private float initialSpeed;
    private List<MDXChunk> chunks;

    public MDXNode getNode() {
        return node;
    }

    public void setNode(MDXNode node) {
        this.node = node;
    }

    public float getEmissionRate() {
        return emissionRate;
    }

    public void setEmissionRate(float emissionRate) {
        this.emissionRate = emissionRate;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public float getLifespan() {
        return lifespan;
    }

    public void setLifespan(float lifespan) {
        this.lifespan = lifespan;
    }

    public float getInitialSpeed() {
        return initialSpeed;
    }

    public void setInitialSpeed(float initialSpeed) {
        this.initialSpeed = initialSpeed;
    }

    public List<MDXChunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<MDXChunk> chunks) {
        this.chunks = chunks;
    }
}
