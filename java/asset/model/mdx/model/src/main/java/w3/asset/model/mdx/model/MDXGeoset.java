package w3.asset.model.mdx.model;

import java.util.List;

public class MDXGeoset {
    private MDXExtent extent;
    private MDXVertexChunk vertexChunk;
    private MDXVertexNormalChunk vertexNormalChunk;
    private MDXFaceTypeGroupChunk faceTypeGroupChunk;
    private MDXFaceGroupChunk faceGroupChunk;
    private MDXFaceChunk faceChunk;
    private MDXVertexGroupChunk vertexGroupChunk;
    private MDXMatrixGroupChunk matrixGroupChunk;
    private MDXMatrixIndexChunk matrixIndexChunk;
    private long materialId;
    private long selectionGroupId;
    private long selectionFlags;

    private List<MDXExtent> extents;

    private MDXTexCoordSetChunk texCoordSetChunk;

    public MDXTexCoordSetChunk getTexCoordSetChunk() {
        return texCoordSetChunk;
    }

    public void setTexCoordSetChunk(MDXTexCoordSetChunk texCoordSetChunk) {
        this.texCoordSetChunk = texCoordSetChunk;
    }

    public List<MDXExtent> getExtents() {
        return extents;
    }

    public void setExtents(List<MDXExtent> extents) {
        this.extents = extents;
    }

    public MDXExtent getExtent() {
        return extent;
    }

    public void setExtent(MDXExtent extent) {
        this.extent = extent;
    }

    public MDXVertexChunk getVertexChunk() {
        return vertexChunk;
    }

    public void setVertexChunk(MDXVertexChunk vertexChunk) {
        this.vertexChunk = vertexChunk;
    }

    public MDXVertexNormalChunk getVertexNormalChunk() {
        return vertexNormalChunk;
    }

    public void setVertexNormalChunk(MDXVertexNormalChunk vertexNormalChunk) {
        this.vertexNormalChunk = vertexNormalChunk;
    }

    public MDXFaceTypeGroupChunk getFaceTypeGroupChunk() {
        return faceTypeGroupChunk;
    }

    public void setFaceTypeGroupChunk(MDXFaceTypeGroupChunk faceTypeGroupChunk) {
        this.faceTypeGroupChunk = faceTypeGroupChunk;
    }

    public MDXFaceGroupChunk getFaceGroupChunk() {
        return faceGroupChunk;
    }

    public void setFaceGroupChunk(MDXFaceGroupChunk faceGroupChunk) {
        this.faceGroupChunk = faceGroupChunk;
    }

    public MDXFaceChunk getFaceChunk() {
        return faceChunk;
    }

    public void setFaceChunk(MDXFaceChunk faceChunk) {
        this.faceChunk = faceChunk;
    }

    public MDXVertexGroupChunk getVertexGroupChunk() {
        return vertexGroupChunk;
    }

    public void setVertexGroupChunk(MDXVertexGroupChunk vertexGroupChunk) {
        this.vertexGroupChunk = vertexGroupChunk;
    }

    public MDXMatrixGroupChunk getMatrixGroupChunk() {
        return matrixGroupChunk;
    }

    public void setMatrixGroupChunk(MDXMatrixGroupChunk matrixGroupChunk) {
        this.matrixGroupChunk = matrixGroupChunk;
    }

    public MDXMatrixIndexChunk getMatrixIndexChunk() {
        return matrixIndexChunk;
    }

    public void setMatrixIndexChunk(MDXMatrixIndexChunk matrixIndexChunk) {
        this.matrixIndexChunk = matrixIndexChunk;
    }

    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public long getSelectionGroupId() {
        return selectionGroupId;
    }

    public void setSelectionGroupId(long selectionGroupId) {
        this.selectionGroupId = selectionGroupId;
    }

    public long getSelectionFlags() {
        return selectionFlags;
    }

    public void setSelectionFlags(long selectionFlags) {
        this.selectionFlags = selectionFlags;
    }
}
