package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXTexAnimChunkSerializer;
import w3.asset.model.mdx.api.MDXTexAnimSerializer;
import w3.asset.model.mdx.model.MDXTexAnim;
import w3.asset.model.mdx.model.MDXTexAnimChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTexAnimChunkSerializer extends StdMDXChunkSerializer implements MDXTexAnimChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXTexAnimSerializer texAnimSerializer;

    public StdMDXTexAnimChunkSerializer(Wc3BinOutputStream outputStream, MDXTexAnimSerializer texAnimSerializer) {
        this.outputStream = outputStream;
        this.texAnimSerializer = texAnimSerializer;
    }

    @Override
    public void serialize(MDXTexAnimChunk data) {
        write(data);
    }

    private void write(MDXTexAnimChunk texAnimChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(stream);

                break;
        }
    }

    private void write_0x0(MDXTexAnimChunk texAnimChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(texAnimChunk.getToken());

        for (final MDXTexAnim texAnim : texAnimChunk.getTexAnims()) {
            texAnimSerializer.serialize(texAnim);
        }

        header.rewrite();
    }
}
