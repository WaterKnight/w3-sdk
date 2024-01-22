package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXCameraTranslationTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXCameraTranslationTrack;
import w3.asset.model.mdx.model.MDXCameraTranslationTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXCameraTranslationTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXCameraTranslationTrackChunk, MDXCameraTranslationTrack> implements MDXCameraTranslationTrackChunkSerializer {
    public StdMDXCameraTranslationTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXCameraTranslationTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
