package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitter2LengthTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXParticleEmitter2LengthTrack;
import w3.asset.model.mdx.model.MDXParticleEmitter2LengthTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXParticleEmitter2LengthTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXParticleEmitter2LengthTrackChunk, MDXParticleEmitter2LengthTrack> implements MDXParticleEmitter2LengthTrackChunkSerializer {
    public StdMDXParticleEmitter2LengthTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXParticleEmitter2LengthTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
