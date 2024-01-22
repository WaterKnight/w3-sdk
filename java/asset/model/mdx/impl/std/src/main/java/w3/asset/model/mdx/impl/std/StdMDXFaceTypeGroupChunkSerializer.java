package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXFaceTypeGroupChunkSerializer;
import w3.asset.model.mdx.api.MDXFaceTypeGroupSerializer;
import w3.asset.model.mdx.model.MDXFaceTypeGroup;
import w3.asset.model.mdx.model.MDXFaceTypeGroupChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXFaceTypeGroupChunkSerializer extends StdMDXChunkSerializer implements MDXFaceTypeGroupChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXFaceTypeGroupSerializer faceTypeGroupSerializer;

    public StdMDXFaceTypeGroupChunkSerializer(Wc3BinOutputStream outputStream, MDXFaceTypeGroupSerializer faceTypeGroupSerializer) {
        this.outputStream = outputStream;
        this.faceTypeGroupSerializer = faceTypeGroupSerializer;
    }

    @Override
    public void serialize(MDXFaceTypeGroupChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXFaceTypeGroupChunk faceTypeGroupChunk) {
        outputStream.writeId(faceTypeGroupChunk.getToken());

        outputStream.writeUInt32(faceTypeGroupChunk.getFaceTypeGroups().size());

        for (MDXFaceTypeGroup faceTypeGroup : faceTypeGroupChunk.getFaceTypeGroups()) {
            faceTypeGroupSerializer.serialize(faceTypeGroup);
        }
    }
}
