package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXTexAnimSerializer;
import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.model.MDXTexAnim;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXTexAnimSerializer implements MDXTexAnimSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXTexAnimSerializer(Wc3BinOutputStream outputStream, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXTexAnim data) {
        write_0x0(data);
    }

    public void write_0x0(MDXTexAnim texAnim) {
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        for (MDXChunk chunk : texAnim.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
