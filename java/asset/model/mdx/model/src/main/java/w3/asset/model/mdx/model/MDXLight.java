package w3.asset.model.mdx.model;

import java.util.List;

public class MDXLight {
    private MDXNode node;

    private Type type;

    private float attentuationStart;
    private float attentuationEnd;

    private Color color;

    private float intensity;

    private Color ambientColor;

    private float ambientIntensity;

    private List<MDXChunk> chunks;

    public MDXNode getNode() {
        return node;
    }

    public void setNode(MDXNode node) {
        this.node = node;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public float getAttentuationStart() {
        return attentuationStart;
    }

    public void setAttentuationStart(float attentuationStart) {
        this.attentuationStart = attentuationStart;
    }

    public float getAttentuationEnd() {
        return attentuationEnd;
    }

    public void setAttentuationEnd(float attentuationEnd) {
        this.attentuationEnd = attentuationEnd;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getIntensity() {
        return intensity;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public Color getAmbientColor() {
        return ambientColor;
    }

    public void setAmbientColor(Color ambientColor) {
        this.ambientColor = ambientColor;
    }

    public float getAmbientIntensity() {
        return ambientIntensity;
    }

    public void setAmbientIntensity(float ambientIntensity) {
        this.ambientIntensity = ambientIntensity;
    }

    public List<MDXChunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<MDXChunk> chunks) {
        this.chunks = chunks;
    }

    public enum Type {
        OMNI,
        DIRECTIONAL,
        AMBIENT
    }

    public static class Color {
        private float blue;
        private float green;
        private float red;

        public float getBlue() {
            return blue;
        }

        public void setBlue(float blue) {
            this.blue = blue;
        }

        public float getGreen() {
            return green;
        }

        public void setGreen(float green) {
            this.green = green;
        }

        public float getRed() {
            return red;
        }

        public void setRed(float red) {
            this.red = red;
        }
    }
}
