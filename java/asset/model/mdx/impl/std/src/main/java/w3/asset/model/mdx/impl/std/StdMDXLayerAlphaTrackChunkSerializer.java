package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXLayerAlphaTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXLayerAlphaTrack;
import w3.asset.model.mdx.model.MDXLayerAlphaTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXLayerAlphaTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXLayerAlphaTrackChunk, MDXLayerAlphaTrack> implements MDXLayerAlphaTrackChunkSerializer {

    public StdMDXLayerAlphaTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXLayerAlphaTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
