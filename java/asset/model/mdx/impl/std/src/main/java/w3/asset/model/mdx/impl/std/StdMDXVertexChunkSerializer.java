package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXVertexChunkSerializer;
import w3.asset.model.mdx.api.MDXVertexSerializer;
import w3.asset.model.mdx.model.MDXVertex;
import w3.asset.model.mdx.model.MDXVertexChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXVertexChunkSerializer extends StdMDXChunkSerializer implements MDXVertexChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXVertexSerializer vertexSerializer;

    public StdMDXVertexChunkSerializer(Wc3BinOutputStream outputStream, MDXVertexSerializer vertexSerializer) {
        this.outputStream = outputStream;
        this.vertexSerializer = vertexSerializer;
    }

    @Override
    public void serialize(MDXVertexChunk data) {
        write_0x0(data);
    }

    public void write_0x0(MDXVertexChunk vertexChunk) {
        outputStream.writeId(vertexChunk.getToken());

        outputStream.writeUInt32(vertexChunk.getVertices().size());

        for (MDXVertex vertex : vertexChunk.getVertices()) {
            vertexSerializer.serialize(vertex);
        }
    }
}
