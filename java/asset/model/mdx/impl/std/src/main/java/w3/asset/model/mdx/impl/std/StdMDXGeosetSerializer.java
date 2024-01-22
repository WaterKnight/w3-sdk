package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.*;
import w3.asset.model.mdx.model.*;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXGeosetSerializer implements MDXGeosetSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXExtentSerializer extentSerializer;
    private final MDXVertexChunkSerializer vertexChunkSerializer;
    private final MDXVertexNormalChunkSerializer vertexNormalChunkSerializer;
    private final MDXFaceTypeGroupChunkSerializer faceTypeGroupChunkSerializer;
    private final MDXFaceGroupChunkSerializer faceGroupChunkSerializer;
    private final MDXFaceChunkSerializer faceChunkSerializer;
    private final MDXVertexGroupChunkSerializer vertexGroupChunkSerializer;
    private final MDXMatrixGroupChunkSerializer matrixGroupChunkSerializer;
    private final MDXMatrixIndexChunkSerializer matrixIndexChunkSerializer;
    private final MDXTexCoordSetChunkSerializer texCoordSetChunkSerializer;

    public StdMDXGeosetSerializer(
            Wc3BinOutputStream outputStream,
            MDXExtentSerializer extentSerializer,
            MDXVertexChunkSerializer vertexChunkSerializer,
            MDXVertexNormalChunkSerializer vertexNormalChunkSerializer,
            MDXFaceTypeGroupChunkSerializer faceTypeGroupChunkSerializer,
            MDXFaceGroupChunkSerializer faceGroupChunkSerializer,
            MDXFaceChunkSerializer faceChunkSerializer,
            MDXVertexGroupChunkSerializer vertexGroupChunkSerializer,
            MDXMatrixGroupChunkSerializer matrixGroupChunkSerializer,
            MDXMatrixIndexChunkSerializer matrixIndexChunkSerializer,
            MDXTexCoordSetChunkSerializer texCoordSetChunkSerializer
    ) {
        this.outputStream = outputStream;
        this.extentSerializer = extentSerializer;
        this.vertexChunkSerializer = vertexChunkSerializer;
        this.vertexNormalChunkSerializer = vertexNormalChunkSerializer;
        this.faceTypeGroupChunkSerializer = faceTypeGroupChunkSerializer;
        this.faceGroupChunkSerializer = faceGroupChunkSerializer;
        this.faceChunkSerializer = faceChunkSerializer;
        this.vertexGroupChunkSerializer = vertexGroupChunkSerializer;
        this.matrixGroupChunkSerializer = matrixGroupChunkSerializer;
        this.matrixIndexChunkSerializer = matrixIndexChunkSerializer;
        this.texCoordSetChunkSerializer = texCoordSetChunkSerializer;
    }

    @Override
    public void serialize(MDXGeoset data) {
        write_0x0(data);
    }

    public void write_0x0(MDXGeoset geoset) {
        //stream.writeUInt32(_inclusiveSize);
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        vertexChunkSerializer.serialize(geoset.getVertexChunk());
        vertexNormalChunkSerializer.serialize(geoset.getVertexNormalChunk());
        faceTypeGroupChunkSerializer.serialize(geoset.getFaceTypeGroupChunk());
        faceGroupChunkSerializer.serialize(geoset.getFaceGroupChunk());
        faceChunkSerializer.serialize(geoset.getFaceChunk());
        vertexGroupChunkSerializer.serialize(geoset.getVertexGroupChunk());
        matrixGroupChunkSerializer.serialize(geoset.getMatrixGroupChunk());
        matrixIndexChunkSerializer.serialize(geoset.getMatrixIndexChunk());

        outputStream.writeUInt32(geoset.getMaterialId());
        outputStream.writeUInt32(geoset.getSelectionGroupId());
        outputStream.writeUInt32(geoset.getSelectionFlags());

        extentSerializer.serialize(geoset.getExtent());

        outputStream.writeUInt32(geoset.getExtents().size());

        for (MDXExtent extent : geoset.getExtents()) {
            extentSerializer.serialize(extent);
        }

        texCoordSetChunkSerializer.serialize(geoset.getTexCoordSetChunk());

        sizeWriter.rewrite();
    }
}
