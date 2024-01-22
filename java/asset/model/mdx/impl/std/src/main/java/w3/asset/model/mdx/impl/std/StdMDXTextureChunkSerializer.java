package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTextureChunkSerializer;
import w3.asset.model.mdx.api.MDXTextureSerializer;
import w3.asset.model.mdx.model.MDXTexture;
import w3.asset.model.mdx.model.MDXTextureChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTextureChunkSerializer extends StdMDXChunkSerializer implements MDXTextureChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXTextureSerializer textureSerializer;

    public StdMDXTextureChunkSerializer(Wc3BinOutputStream outputStream, MDXTextureSerializer textureSerializer) {
        this.outputStream = outputStream;
        this.textureSerializer = textureSerializer;
    }

    @Override
    public void serialize(MDXTextureChunk data) {
        write_0x0(data);
    }

    private void write_0x0(MDXTextureChunk textureChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(textureChunk.getToken());

        for (MDXTexture texture : textureChunk.getTextures()) {
            textureSerializer.serialize(texture);
        }

        header.rewrite();
    }
}
