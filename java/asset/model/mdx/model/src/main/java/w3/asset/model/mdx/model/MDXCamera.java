package w3.asset.model.mdx.model;

import java.util.List;

public class MDXCamera {
    private String name;
    private float x;
    private float y;
    private float z;
    private float fieldOfView;
    private float farClippingPlane;
    private float nearClippingPlane;
    private float targetX;
    private float targetY;
    private float targetZ;

    private List<MDXChunk> chunks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(float fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public float getFarClippingPlane() {
        return farClippingPlane;
    }

    public void setFarClippingPlane(float farClippingPlane) {
        this.farClippingPlane = farClippingPlane;
    }

    public float getNearClippingPlane() {
        return nearClippingPlane;
    }

    public void setNearClippingPlane(float nearClippingPlane) {
        this.nearClippingPlane = nearClippingPlane;
    }

    public float getTargetX() {
        return targetX;
    }

    public void setTargetX(float targetX) {
        this.targetX = targetX;
    }

    public float getTargetY() {
        return targetY;
    }

    public void setTargetY(float targetY) {
        this.targetY = targetY;
    }

    public float getTargetZ() {
        return targetZ;
    }

    public void setTargetZ(float targetZ) {
        this.targetZ = targetZ;
    }

    public List<MDXChunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<MDXChunk> chunks) {
        this.chunks = chunks;
    }
}
