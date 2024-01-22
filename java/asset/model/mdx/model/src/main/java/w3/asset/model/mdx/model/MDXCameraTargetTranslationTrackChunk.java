package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXCameraTargetTranslationTrackChunk extends MDXTracksChunk<MDXCameraTargetTranslationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KTTR");
    }

    private List<MDXCameraTargetTranslationTrack> tracks;

    @Override
    public List<MDXCameraTargetTranslationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXCameraTargetTranslationTrack> tracks) {
        this.tracks = tracks;
    }
}
