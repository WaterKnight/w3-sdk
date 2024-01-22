package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXAttachmentChunkSerializer;
import w3.asset.model.mdx.api.MDXAttachmentSerializer;
import w3.asset.model.mdx.model.MDXAttachment;
import w3.asset.model.mdx.model.MDXAttachmentChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXAttachmentChunkSerializer implements MDXAttachmentChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXAttachmentSerializer attachmentSerializer;

    public StdMDXAttachmentChunkSerializer(Wc3BinOutputStream outputStream, MDXAttachmentSerializer attachmentSerializer) {
        this.outputStream = outputStream;
        this.attachmentSerializer = attachmentSerializer;
    }

    @Override
    public void serialize(MDXAttachmentChunk data) {

    }

    private void write(MDXAttachmentChunk attachmentChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(attachmentChunk);

                break;
        }
    }

    private void write_0x0(MDXAttachmentChunk attachmentChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(attachmentChunk.getToken());

        for (MDXAttachment attachment : attachmentChunk.getAttachments()) {
            attachmentSerializer.serialize(attachment);
        }

        header.rewrite();
    }
}
