package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXSerializer;
import w3.asset.model.mdx.model.EncodingFormat;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXChunk;
import w3.common.core.BinStream;
import w3.common.core.Id;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;

public class StdMDXSerializer implements MDXSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXSerializer(Wc3BinOutputStream outputStream, EncodingFormat format, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.format = format;
        this.chunkSerializer = chunkSerializer;
    }

    public static Id TOKEN = Id.valueOf("MDLX");

    @Override
    public void serialize(MDX data) {

    }

    private void write(MDX mdx) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0: {
                write_0x0(mdx);

                break;
            }
        }
    }

    private void write_0x0(MDX mdx) {
        outputStream.writeId(TOKEN);

        for (MDXChunk chunk : mdx.getChunk()) {
            chunkSerializer.serialize(chunk);
        }
    }
}
