package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXBoneChunkSerializer;
import w3.asset.model.mdx.api.MDXBoneSerializer;
import w3.asset.model.mdx.model.EncodingFormat;
import w3.asset.model.mdx.model.MDXBone;
import w3.asset.model.mdx.model.MDXBoneChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXBoneChunkSerializer implements MDXBoneChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;
    private final MDXBoneSerializer boneSerializer;

    public StdMDXBoneChunkSerializer(Wc3BinOutputStream outputStream, EncodingFormat format, MDXBoneSerializer boneSerializer) {
        this.outputStream = outputStream;
        this.format = format;
        this.boneSerializer = boneSerializer;
    }

    @Override
    public void serialize(MDXBoneChunk data) {
        write(data);
    }

    private void write(MDXBoneChunk boneChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(boneChunk);

                break;
        }
    }

    private void write_0x0(MDXBoneChunk boneChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(boneChunk.getToken());
        for (MDXBone bone : boneChunk.getBones()) {
            boneSerializer.serialize(bone);
        }

        header.rewrite();
    }
}
