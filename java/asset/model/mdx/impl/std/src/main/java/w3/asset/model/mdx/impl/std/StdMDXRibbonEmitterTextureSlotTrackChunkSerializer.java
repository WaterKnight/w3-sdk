package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXRibbonEmitterTextureSlotTrackChunkSerializer;
import w3.asset.model.mdx.model.MDX;
import w3.asset.model.mdx.model.MDXRibbonEmitterTextureSlotTrack;
import w3.asset.model.mdx.model.MDXRibbonEmitterTextureSlotTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

import javax.annotation.Nonnull;
import java.util.LinkedHashSet;
import java.util.Set;

public class StdMDXRibbonEmitterTextureSlotTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXRibbonEmitterTextureSlotTrackChunk, MDXRibbonEmitterTextureSlotTrack> implements MDXRibbonEmitterTextureSlotTrackChunkSerializer {
    public StdMDXRibbonEmitterTextureSlotTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXRibbonEmitterTextureSlotTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
