package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXExtentSerializer;
import w3.asset.model.mdx.api.MDXSequenceSerializer;
import w3.asset.model.mdx.model.MDXSequence;
import w3.common.core.Wc3BinOutputStream;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StdMDXSequenceSerializer implements MDXSequenceSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXExtentSerializer extentSerializer;

    public StdMDXSequenceSerializer(Wc3BinOutputStream outputStream, MDXExtentSerializer extentSerializer) {
        this.outputStream = outputStream;
        this.extentSerializer = extentSerializer;
    }

    @Override
    public void serialize(MDXSequence data) {
        write_0x0(data);
    }

    private void write_0x0(MDXSequence sequence) {
        outputStream.writeBytes(Arrays.copyOf(sequence.getName().getBytes(StandardCharsets.US_ASCII), 80));
        outputStream.writeUInt32(sequence.getIntervalStart());
        outputStream.writeUInt32(sequence.getIntervalEnd());
        outputStream.writeFloat32(sequence.getMoveSpeed());
        outputStream.writeUInt32(sequence.getFlags());
        outputStream.writeFloat32(sequence.getRarity());
        outputStream.writeUInt32(sequence.getSyncPoint());

        extentSerializer.serialize(sequence.getExtent());
    }
}
