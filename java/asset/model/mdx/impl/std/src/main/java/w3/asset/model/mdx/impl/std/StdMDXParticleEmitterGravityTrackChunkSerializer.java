package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitterGravityTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXParticleEmitterGravityTrack;
import w3.asset.model.mdx.model.MDXParticleEmitterGravityTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitterGravityTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitterGravityTrackChunk, MDXParticleEmitterGravityTrack> implements MDXParticleEmitterGravityTrackChunkSerializer {
    public StdMDXParticleEmitterGravityTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitterGravityTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
