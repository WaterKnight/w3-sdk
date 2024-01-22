package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitterLongitudeTrackChunkSerializer;
import w3.asset.model.mdx.api.MDXParticleEmitterLongitudeTrackSerializer;
import w3.asset.model.mdx.model.MDXParticleEmitterLongitudeTrack;
import w3.asset.model.mdx.model.MDXParticleEmitterLongitudeTrackChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitterLongitudeTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitterLongitudeTrackChunk, MDXParticleEmitterLongitudeTrack> implements MDXParticleEmitterLongitudeTrackChunkSerializer {
    public StdMDXParticleEmitterLongitudeTrackChunkSerializer(Wc3BinOutputStream outputStream, MDXParticleEmitterLongitudeTrackSerializer particleEmitterLongitudeTrackSerializer) {
        super(outputStream, particleEmitterLongitudeTrackSerializer);
    }
}
