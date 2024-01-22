package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXCameraTargetTranslationTrackChunkSerializer;
import w3.asset.model.mdx.model.MDXCameraTargetTranslationTrack;
import w3.asset.model.mdx.model.MDXCameraTargetTranslationTrackChunk;
import w3.common.api.Serializer;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXCameraTargetTranslationTrackChunkSerializer extends StdMDXTrackChunkSerializer<MDXCameraTargetTranslationTrackChunk, MDXCameraTargetTranslationTrack> implements MDXCameraTargetTranslationTrackChunkSerializer {
    public StdMDXCameraTargetTranslationTrackChunkSerializer(Wc3BinOutputStream outputStream, Serializer<MDXCameraTargetTranslationTrack> trackSerializer) {
        super(outputStream, trackSerializer);
    }
}
