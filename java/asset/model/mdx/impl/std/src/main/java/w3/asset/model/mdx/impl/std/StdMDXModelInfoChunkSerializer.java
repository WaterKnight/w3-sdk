package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXExtentSerializer;
import w3.asset.model.mdx.api.MDXModelInfoChunkSerializer;
import w3.asset.model.mdx.model.MDXModelInfoChunk;
import w3.common.core.Wc3BinOutputStream;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StdMDXModelInfoChunkSerializer implements MDXModelInfoChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXExtentSerializer extentSerializer;

    public StdMDXModelInfoChunkSerializer(Wc3BinOutputStream outputStream, MDXExtentSerializer extentSerializer) {
        this.outputStream = outputStream;
        this.extentSerializer = extentSerializer;
    }

    @Override
    public void serialize(MDXModelInfoChunk data) {

    }

    private void write(MDXModelInfoChunk modelInfoChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(modelInfoChunk);

                break;
        }
    }

    private void write_0x0(MDXModelInfoChunk modelInfoChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(modelInfoChunk.getToken());

        outputStream.writeBytes(Arrays.copyOf(modelInfoChunk.getName().getBytes(StandardCharsets.US_ASCII), 80));
        outputStream.writeBytes(Arrays.copyOf(modelInfoChunk.getAnimFileName().getBytes(StandardCharsets.US_ASCII), 260));

        extentSerializer.serialize(modelInfoChunk.getExtent());

        outputStream.writeUInt32(modelInfoChunk.getBlendTime());

        header.rewrite();
    }
}
