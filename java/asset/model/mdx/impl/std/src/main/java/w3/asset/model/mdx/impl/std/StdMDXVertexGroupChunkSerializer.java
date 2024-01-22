package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXVertexGroupChunkSerializer;
import w3.asset.model.mdx.api.MDXVertexGroupSerializer;
import w3.asset.model.mdx.model.MDXVertexGroup;
import w3.asset.model.mdx.model.MDXVertexGroupChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXVertexGroupChunkSerializer extends StdMDXChunkSerializer implements MDXVertexGroupChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXVertexGroupSerializer vertexGroupSerializer;

    public StdMDXVertexGroupChunkSerializer(Wc3BinOutputStream outputStream, MDXVertexGroupSerializer vertexGroupSerializer) {
        this.outputStream = outputStream;
        this.vertexGroupSerializer = vertexGroupSerializer;
    }

    @Override
    public void serialize(MDXVertexGroupChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXVertexGroupChunk vertexGroupChunk) {
        outputStream.writeId(vertexGroupChunk.getToken());

        outputStream.writeUInt32(vertexGroupChunk.getVertexGroups().size());

        for (MDXVertexGroup vertexGroup : vertexGroupChunk.getVertexGroups()) {
            vertexGroupSerializer.serialize(vertexGroup);
        }
    }
}
