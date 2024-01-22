package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXGlobalSequenceChunkSerializer;
import w3.asset.model.mdx.api.MDXGlobalSequenceSerializer;
import w3.asset.model.mdx.model.MDXGlobalSequence;
import w3.asset.model.mdx.model.MDXGlobalSequenceChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXGlobalSequenceChunkSerializer extends StdMDXChunkSerializer implements MDXGlobalSequenceChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXGlobalSequenceSerializer globalSequenceSerializer;

    public StdMDXGlobalSequenceChunkSerializer(Wc3BinOutputStream outputStream, MDXGlobalSequenceSerializer globalSequenceSerializer) {
        this.outputStream = outputStream;
        this.globalSequenceSerializer = globalSequenceSerializer;
    }

    @Override
    public void serialize(MDXGlobalSequenceChunk data) {
        write(data);
    }

    private void write(MDXGlobalSequenceChunk globalSequenceChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(globalSequenceChunk);

                break;
        }
    }

    private void write_0x0(MDXGlobalSequenceChunk globalSequenceChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(globalSequenceChunk.getToken());

        for (MDXGlobalSequence sequence : globalSequenceChunk.getGlobalSequences()) {
            globalSequenceSerializer.serialize(sequence);
        }

        header.rewrite();
    }
}
