package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXAttachmentSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.api.MDXVisibilityTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXAttachment;
import w3.asset.model.mdx.model.MDXVisibilityTrackChunk;
import w3.common.core.Wc3BinOutputStream;

import java.util.Arrays;

public class StdMDXAttachmentSerializer implements MDXAttachmentSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXNodeSerializer nodeSerializer;
    private final MDXVisibilityTrackChunkSerializer visibilityTrackChunkSerializer;

    public StdMDXAttachmentSerializer(Wc3BinOutputStream outputStream, MDXNodeSerializer nodeSerializer, MDXVisibilityTrackChunkSerializer visibilityTrackChunkSerializer) {
        this.outputStream = outputStream;
        this.nodeSerializer = nodeSerializer;
        this.visibilityTrackChunkSerializer = visibilityTrackChunkSerializer;
    }

    @Override
    public void serialize(MDXAttachment data) {
        write_0x0(data);
    }

    public void write_0x0(MDXAttachment attachment) {
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write(outputStream);

        nodeSerializer.serialize(attachment.getNode());
        outputStream.writeBytes(Arrays.copyOf(attachment.getPath().getBytes(), 260));
        outputStream.writeUInt32(attachment.getAttachmentId());

        for (MDXVisibilityTrackChunk visibilityTrackChunk : attachment.getVisibilityTrackChunks()) {
            visibilityTrackChunkSerializer.serialize(visibilityTrackChunk);
        }

        sizeWriter.rewrite();
    }
}
