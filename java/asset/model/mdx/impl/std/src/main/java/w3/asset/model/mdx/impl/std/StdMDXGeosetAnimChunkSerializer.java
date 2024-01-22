package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXGeosetAnimChunkSerializer;
import w3.asset.model.mdx.api.MDXGeosetAnimSerializer;
import w3.asset.model.mdx.model.MDXGeosetAnim;
import w3.asset.model.mdx.model.MDXGeosetAnimChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXGeosetAnimChunkSerializer extends StdMDXChunkSerializer implements MDXGeosetAnimChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXGeosetAnimSerializer geosetAnimSerializer;

    public StdMDXGeosetAnimChunkSerializer(Wc3BinOutputStream outputStream, MDXGeosetAnimSerializer geosetAnimSerializer) {
        this.outputStream = outputStream;
        this.geosetAnimSerializer = geosetAnimSerializer;
    }

    @Override
    public void serialize(MDXGeosetAnimChunk data) {
        write(data);
    }

    private void write(MDXGeosetAnimChunk geosetAnimChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(geosetAnimChunk);

                break;
        }
    }

    private void write_0x0(MDXGeosetAnimChunk geosetAnimChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(geosetAnimChunk.getToken());

        for (MDXGeosetAnim geosetAnim : geosetAnimChunk.getGeosetAnims()) {
            geosetAnimSerializer.serialize(geosetAnim);
        }

        header.rewrite();
    }
}
