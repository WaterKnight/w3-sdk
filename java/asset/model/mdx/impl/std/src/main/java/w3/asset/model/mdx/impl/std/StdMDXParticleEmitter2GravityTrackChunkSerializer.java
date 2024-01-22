package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2GravityTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXParticleEmitter2GravityTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2GravityTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXParticleEmitter2GravityTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2GravityTrackChunk, MDXParticleEmitter2GravityTrack> implements MDXParticleEmitter2GravityTrackChunkSerializer {
    public StdMDXParticleEmitter2GravityTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2GravityTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
