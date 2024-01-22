package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2EmissionRateTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXParticleEmitter2EmissionRateTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2EmissionRateTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXParticleEmitter2EmissionRateTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2EmissionRateTrackChunk, MDXParticleEmitter2EmissionRateTrack> implements MDXParticleEmitter2EmissionRateTrackChunkSerializer {
    public StdMDXParticleEmitter2EmissionRateTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2EmissionRateTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
