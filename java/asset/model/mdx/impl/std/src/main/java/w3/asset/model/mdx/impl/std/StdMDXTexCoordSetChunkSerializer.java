package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTexCoordSetChunkSerializer;
import w3.asset.model.mdx.api.MDXTexCoordSetSerializer;
import w3.asset.model.mdx.model.MDXTexCoordSet;
import w3.asset.model.mdx.model.MDXTexCoordSetChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTexCoordSetChunkSerializer extends StdMDXChunkSerializer implements MDXTexCoordSetChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXTexCoordSetSerializer texCoordSetSerializer;

    public StdMDXTexCoordSetChunkSerializer(Wc3BinOutputStream outputStream, MDXTexCoordSetSerializer texCoordSetSerializer) {
        this.outputStream = outputStream;
        this.texCoordSetSerializer = texCoordSetSerializer;
    }

    @Override
    public void serialize(MDXTexCoordSetChunk data) {
        write_0x0(data);
    }

    public void write_0x0(MDXTexCoordSetChunk texCoordSetChunk) {
        outputStream.writeId(texCoordSetChunk.getToken());

        outputStream.writeUInt32(texCoordSetChunk.getTexCoordSets().size());

        for (MDXTexCoordSet texCoordSet : texCoordSetChunk.getTexCoordSets()) {
            texCoordSetSerializer.serialize(texCoordSet);
        }
    }
}
