package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXGeosetChunkSerializer;
import w3.asset.model.mdx.api.MDXGeosetSerializer;
import w3.asset.model.mdx.model.MDXGeoset;
import w3.asset.model.mdx.model.MDXGeosetChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXGeosetChunkSerializer extends StdMDXChunkSerializer implements MDXGeosetChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXGeosetSerializer geosetSerializer;

    public StdMDXGeosetChunkSerializer(Wc3BinOutputStream outputStream, MDXGeosetSerializer geosetSerializer) {
        this.outputStream = outputStream;
        this.geosetSerializer = geosetSerializer;
    }

    @Override
    public void serialize(MDXGeosetChunk data) {
        write(data);
    }

    private void write(MDXGeosetChunk geosetChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(geosetChunk);

                break;
        }
    }

    private void write_0x0(MDXGeosetChunk geosetChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(geosetChunk.getToken());

        for (MDXGeoset geoset : geosetChunk.getGeosets()) {
            geosetSerializer.serialize(geoset);
        }

        header.rewrite();
    }
}
