package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXMatrixIndexChunkSerializer;
import w3.asset.model.mdx.api.MDXMatrixIndexSerializer;
import w3.asset.model.mdx.model.MDXMatrixIndex;
import w3.asset.model.mdx.model.MDXMatrixIndexChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXMatrixIndexChunkSerializer extends StdMDXChunkSerializer implements MDXMatrixIndexChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXMatrixIndexSerializer matrixIndexSerializer;

    public StdMDXMatrixIndexChunkSerializer(Wc3BinOutputStream outputStream, MDXMatrixIndexSerializer matrixIndexSerializer) {
        this.outputStream = outputStream;
        this.matrixIndexSerializer = matrixIndexSerializer;
    }

    @Override
    public void serialize(MDXMatrixIndexChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXMatrixIndexChunk matrixIndexChunk) {
        outputStream.writeId(matrixIndexChunk.getToken());

        outputStream.writeUInt32(matrixIndexChunk.getMatrixIndices().size());

        for (MDXMatrixIndex matrixIndex : matrixIndexChunk.getMatrixIndices()) {
            matrixIndexSerializer.serialize(matrixIndex);
        }
    }
}
