package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXHelperChunkSerializer;
import w3.asset.model.mdx.api.MDXHelperSerializer;
import w3.asset.model.mdx.model.MDXHelper;
import w3.asset.model.mdx.model.MDXHelperChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXHelperChunkSerializer extends StdMDXChunkSerializer implements MDXHelperChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXHelperSerializer helperSerializer;

    public StdMDXHelperChunkSerializer(MDXHelperSerializer helperSerializer) {
        this.helperSerializer = helperSerializer;
    }

    @Override
    public void serialize(MDXHelperChunk data) {
        write(data);
    }

    private void write_0x0(MDXHelperChunk helperChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(helperChunk.getToken());

        for (MDXHelper helper : helperChunk.getHelpers()) {
            helperSerializer.serialize(helper);
        }

        header.rewrite();
    }
}
