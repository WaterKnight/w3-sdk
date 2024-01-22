package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2LatitudeTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXParticleEmitter2LatitudeTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2LatitudeTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXParticleEmitter2LatitudeTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2LatitudeTrackChunk, MDXParticleEmitter2LatitudeTrack> implements MDXParticleEmitter2LatitudeTrackChunkSerializer {
    public StdMDXParticleEmitter2LatitudeTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2LatitudeTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
