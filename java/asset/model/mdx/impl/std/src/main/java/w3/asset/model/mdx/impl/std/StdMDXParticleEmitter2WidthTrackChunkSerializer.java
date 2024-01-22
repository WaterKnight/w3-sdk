package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2WidthTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXParticleEmitter2WidthTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2WidthTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitter2WidthTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2WidthTrackChunk, MDXParticleEmitter2WidthTrack> implements MDXParticleEmitter2WidthTrackChunkSerializer {
    public StdMDXParticleEmitter2WidthTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2WidthTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
