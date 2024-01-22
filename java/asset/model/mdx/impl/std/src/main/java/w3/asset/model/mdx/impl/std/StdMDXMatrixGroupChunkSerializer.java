package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXMatrixGroupChunkSerializer;
import w3.asset.model.mdx.api.MDXMatrixGroupSerializer;
import w3.asset.model.mdx.model.MDXMatrixGroup;
import w3.asset.model.mdx.model.MDXMatrixGroupChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXMatrixGroupChunkSerializer extends StdMDXChunkSerializer implements MDXMatrixGroupChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXMatrixGroupSerializer matrixGroupSerializer;

    public StdMDXMatrixGroupChunkSerializer(Wc3BinOutputStream outputStream, MDXMatrixGroupSerializer matrixGroupSerializer) {
        this.outputStream = outputStream;
        this.matrixGroupSerializer = matrixGroupSerializer;
    }

    @Override
    public void serialize(MDXMatrixGroupChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXMatrixGroupChunk matrixGroupChunk) {
        outputStream.writeId(matrixGroupChunk.getToken());

        outputStream.writeUInt32(matrixGroupChunk.getMatrixGroups().size());

        for (MDXMatrixGroup matrixGroup : matrixGroupChunk.getMatrixGroups()) {
            matrixGroupSerializer.serialize(matrixGroup);
        }
    }
}
