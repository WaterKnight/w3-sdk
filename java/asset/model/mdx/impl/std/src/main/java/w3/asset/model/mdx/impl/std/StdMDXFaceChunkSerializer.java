package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXFaceChunkSerializer;
import w3.asset.model.mdx.api.MDXFaceSerializer;
import w3.asset.model.mdx.model.MDXFace;
import w3.asset.model.mdx.model.MDXFaceChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXFaceChunkSerializer extends StdMDXChunkSerializer implements MDXFaceChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXFaceSerializer faceSerializer;

    public StdMDXFaceChunkSerializer(Wc3BinOutputStream outputStream, MDXFaceSerializer faceSerializer) {
        this.outputStream = outputStream;
        this.faceSerializer = faceSerializer;
    }

    @Override
    public void serialize(MDXFaceChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXFaceChunk faceChunk) {
        outputStream.writeId(faceChunk.getToken());

        outputStream.writeUInt32(faceChunk.getFaces().size());

        for (MDXFace face : faceChunk.getFaces()) {
            faceSerializer.serialize(face);
        }
    }
}
