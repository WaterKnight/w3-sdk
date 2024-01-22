package w3.asset.model.mdx.model;

import java.util.List;

public class MDXRibbonEmitter {
    private MDXNode node;
    private float heightAbove;
    private float heightBelow;
    private Color color;
    private float lifespan;
    private long textureSlot;
    private long emissionRate;
    private long rows;
    private long columns;
    private long materialId;
    private float gravity;
    private List<MDXChunk> chunks;

    public MDXNode getNode() {
        return node;
    }

    public void setNode(MDXNode node) {
        this.node = node;
    }

    public float getHeightAbove() {
        return heightAbove;
    }

    public void setHeightAbove(float heightAbove) {
        this.heightAbove = heightAbove;
    }

    public float getHeightBelow() {
        return heightBelow;
    }

    public void setHeightBelow(float heightBelow) {
        this.heightBelow = heightBelow;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getLifespan() {
        return lifespan;
    }

    public void setLifespan(float lifespan) {
        this.lifespan = lifespan;
    }

    public long getTextureSlot() {
        return textureSlot;
    }

    public void setTextureSlot(long textureSlot) {
        this.textureSlot = textureSlot;
    }

    public long getEmissionRate() {
        return emissionRate;
    }

    public void setEmissionRate(long emissionRate) {
        this.emissionRate = emissionRate;
    }

    public long getRows() {
        return rows;
    }

    public void setRows(long rows) {
        this.rows = rows;
    }

    public long getColumns() {
        return columns;
    }

    public void setColumns(long columns) {
        this.columns = columns;
    }

    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public List<MDXChunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<MDXChunk> chunks) {
        this.chunks = chunks;
    }

    public static class Color {
        private float alpha;
        private float blue;
        private float green;
        private float red;

        public float getAlpha() {
            return alpha;
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
        }

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
