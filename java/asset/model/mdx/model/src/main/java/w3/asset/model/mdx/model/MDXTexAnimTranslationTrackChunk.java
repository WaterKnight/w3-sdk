package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXTexAnimTranslationTrackChunk extends MDXTracksChunk<MDXTexAnimTranslationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KTAT");
    }

    private List<MDXTexAnimTranslationTrack> tracks;

    @Override
    public List<MDXTexAnimTranslationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXTexAnimTranslationTrack> tracks) {
        this.tracks = tracks;
    }
}
