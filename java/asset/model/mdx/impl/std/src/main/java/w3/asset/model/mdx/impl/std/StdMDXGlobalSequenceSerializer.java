package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXGlobalSequenceSerializer;
import w3.asset.model.mdx.model.MDXGlobalSequence;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXGlobalSequenceSerializer implements MDXGlobalSequenceSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXGlobalSequenceSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXGlobalSequence data) {
        write_0x0(data);
    }

    public void write_0x0(MDXGlobalSequence globalSequence) {
        outputStream.writeUInt32(globalSequence.getDuration());
    }
}
