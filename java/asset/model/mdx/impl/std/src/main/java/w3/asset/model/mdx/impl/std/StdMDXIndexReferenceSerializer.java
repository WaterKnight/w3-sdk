package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXIndexReferenceSerializer;
import w3.asset.model.mdx.model.MDXIndexReference;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXIndexReferenceSerializer implements MDXIndexReferenceSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXIndexReferenceSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXIndexReference data) {
        write_0x0(data);
    }

    private void write_0x0(MDXIndexReference indexReference) {
        outputStream.writeUInt32(indexReference.getIndex());
    }
}
