package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXNodeTranslationTrackChunk extends MDXTracksChunk<MDXNodeTranslationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KGTR");
    }

    private List<MDXNodeTranslationTrack> tracks;

    @Override
    public List<MDXNodeTranslationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXNodeTranslationTrack> tracks) {
        this.tracks = tracks;
    }
}
