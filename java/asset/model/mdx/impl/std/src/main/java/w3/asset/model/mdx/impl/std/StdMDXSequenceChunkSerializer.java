package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXSequenceChunkSerializer;
import w3.asset.model.mdx.api.MDXSequenceSerializer;
import w3.asset.model.mdx.model.MDXSequence;
import w3.asset.model.mdx.model.MDXSequenceChunk;

public class StdMDXSequenceChunkSerializer extends StdMDXChunkSerializer implements MDXSequenceChunkSerializer {
    private final MDXSequenceSerializer sequenceSerializer;

    public StdMDXSequenceChunkSerializer(MDXSequenceSerializer sequenceSerializer) {
        this.sequenceSerializer = sequenceSerializer;
    }

    @Override
    public void serialize(MDXSequenceChunk data) {
        write(data);
    }

    public void write(MDXSequenceChunk sequenceChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(stream);

                break;
        }
    }

    private void write_0x0(MDXSequenceChunk sequenceChunk) {
        MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(stream);

        for (MDXSequence sequence : sequenceChunk.getSequences()) {
            sequenceSerializer.serialize(sequence);
        }

        header.rewrite();
    }
}
