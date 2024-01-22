package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXLightColorTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXLightColorTrack;
import w3.asset.model.mdx.model.MDXLightColorTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXLightColorTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXLightColorTrackChunk, MDXLightColorTrack> implements MDXLightColorTrackChunkSerializer {
    public StdMDXLightColorTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXLightColorTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
