package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitterSpeedTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXParticleEmitterSpeedTrack;
import w3.asset.model.mdx.model.MDXParticleEmitterSpeedTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitterSpeedTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitterSpeedTrackChunk, MDXParticleEmitterSpeedTrack> implements MDXParticleEmitterSpeedTrackChunkSerializer {
    public StdMDXParticleEmitterSpeedTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitterSpeedTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
