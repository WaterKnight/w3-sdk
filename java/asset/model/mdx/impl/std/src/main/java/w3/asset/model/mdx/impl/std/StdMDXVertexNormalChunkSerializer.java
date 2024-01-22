package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXVertexNormalChunkSerializer;
import w3.asset.model.mdx.api.MDXVertexSerializer;
import w3.asset.model.mdx.model.MDXVertex;
import w3.asset.model.mdx.model.MDXVertexNormalChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXVertexNormalChunkSerializer extends StdMDXChunkSerializer implements MDXVertexNormalChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXVertexSerializer vertexSerializer;

    public StdMDXVertexNormalChunkSerializer(Wc3BinOutputStream outputStream, MDXVertexSerializer vertexSerializer) {
        this.outputStream = outputStream;
        this.vertexSerializer = vertexSerializer;
    }

    @Override
    public void serialize(MDXVertexNormalChunk data) {
        write_0x0(data);
    }

    public void write_0x0(MDXVertexNormalChunk vertexNormalChunk) {
        outputStream.writeId(vertexNormalChunk.getToken());

        outputStream.writeUInt32(vertexNormalChunk.getVertices().size());

        for (MDXVertex vertex : vertexNormalChunk.getVertices()) {
            vertexSerializer.serialize(vertex);
        }
    }
}
