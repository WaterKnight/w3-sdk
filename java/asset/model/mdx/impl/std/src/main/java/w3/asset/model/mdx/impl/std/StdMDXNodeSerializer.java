package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.model.MDXChunk;
import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.model.MDXNode;
import w3.common.core.Wc3BinOutputStream;

import java.util.Arrays;

public class StdMDXNodeSerializer implements MDXNodeSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXNodeSerializer(Wc3BinOutputStream outputStream, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXNode data) {
        write_0x0(data);
    }

    private void write_0x0(MDXNode node) {
        //stream.writeUInt32(_inclusiveSize);
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write();

        outputStream.writeBytes(Arrays.copyOf(node.getName().getBytes(), 80));
        outputStream.writeUInt32(node.getObjectId());
        outputStream.writeUInt32(node.getParentId());
        outputStream.writeUInt32(node.getFlags());

        for (MDXChunk chunk : node.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
