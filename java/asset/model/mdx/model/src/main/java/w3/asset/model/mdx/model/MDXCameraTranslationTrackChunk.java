package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXCameraTranslationTrackChunk extends MDXTracksChunk<MDXCameraTranslationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KCTR");
    }

    private List<MDXCameraTranslationTrack> tracks;

    @Override
    public List<MDXCameraTranslationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXCameraTranslationTrack> tracks) {
        this.tracks = tracks;
    }
}
