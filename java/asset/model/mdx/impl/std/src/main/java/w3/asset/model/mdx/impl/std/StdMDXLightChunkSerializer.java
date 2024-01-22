package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXLightChunkSerializer;
import w3.asset.model.mdx.api.MDXLightSerializer;
import w3.asset.model.mdx.model.MDXLight;
import w3.asset.model.mdx.model.MDXLightChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXLightChunkSerializer extends StdMDXChunkSerializer implements MDXLightChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXLightSerializer lightSerializer;

    public StdMDXLightChunkSerializer(Wc3BinOutputStream outputStream, MDXLightSerializer lightSerializer) {
        this.outputStream = outputStream;
        this.lightSerializer = lightSerializer;
    }

    @Override
    public void serialize(MDXLightChunk data) {

    }

    private void write(MDXLightChunk lightChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(lightChunk);

                break;
        }
    }

    private void write_0x0(MDXLightChunk lightChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(lightChunk.getToken());

        for (MDXLight light : lightChunk.getLights()) {
            lightSerializer.serialize(light);
        }

        header.rewrite();
    }
}
