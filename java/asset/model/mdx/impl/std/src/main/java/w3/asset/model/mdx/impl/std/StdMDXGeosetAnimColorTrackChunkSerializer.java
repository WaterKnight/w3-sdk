package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXGeosetAnimColorTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXGeosetAnimColorTrack;
import w3.asset.model.mdx.model.MDXGeosetAnimColorTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXGeosetAnimColorTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXGeosetAnimColorTrackChunk, MDXGeosetAnimColorTrack> implements MDXGeosetAnimColorTrackChunkSerializer {
    public StdMDXGeosetAnimColorTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXGeosetAnimColorTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
