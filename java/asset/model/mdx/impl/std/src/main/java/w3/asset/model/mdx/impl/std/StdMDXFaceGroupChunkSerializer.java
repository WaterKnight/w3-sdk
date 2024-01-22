package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXFaceGroupChunkSerializer;
import w3.asset.model.mdx.api.MDXFaceGroupSerializer;
import w3.asset.model.mdx.model.MDXFaceGroup;
import w3.asset.model.mdx.model.MDXFaceGroupChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXFaceGroupChunkSerializer extends StdMDXChunkSerializer implements MDXFaceGroupChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXFaceGroupSerializer faceGroupSerializer;

    public StdMDXFaceGroupChunkSerializer(Wc3BinOutputStream outputStream, MDXFaceGroupSerializer faceGroupSerializer) {
        this.outputStream = outputStream;
        this.faceGroupSerializer = faceGroupSerializer;
    }

    @Override
    public void serialize(MDXFaceGroupChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXFaceGroupChunk faceGroupChunk) {
        outputStream.writeId(faceGroupChunk.getToken());

        outputStream.writeUInt32(faceGroupChunk.getFaceGroups().size());

        for (MDXFaceGroup faceGroup : faceGroupChunk.getFaceGroups()) {
            faceGroupSerializer.serialize(faceGroup);
        }
    }
}
