package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXVersionChunkSerializer;
import w3.asset.model.mdx.model.MDXVersionChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXVersionChunkSerializer extends StdMDXChunkSerializer implements MDXVersionChunkSerializer {
    private final Wc3BinOutputStream outputStream;

    public StdMDXVersionChunkSerializer(Wc3BinOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(MDXVersionChunk data) {
        write(data);
    }

    private void write(MDXVersionChunk versionChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(versionChunk);

                break;
        }
    }

    private void write_0x0(MDXVersionChunk versionChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(versionChunk.getToken());

        outputStream.writeUInt32(versionChunk.getVersion());

        header.rewrite();
    }
}
