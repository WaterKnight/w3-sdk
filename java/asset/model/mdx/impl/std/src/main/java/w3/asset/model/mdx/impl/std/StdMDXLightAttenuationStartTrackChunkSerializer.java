package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXLightAttenuationStartTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXLightAttenuationStartTrack;
import w3.asset.model.mdx.model.MDXLightAttenuationStartTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXLightAttenuationStartTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXLightAttenuationStartTrackChunk, MDXLightAttenuationStartTrack> implements MDXLightAttenuationStartTrackChunkSerializer {
    public StdMDXLightAttenuationStartTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXLightAttenuationStartTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
