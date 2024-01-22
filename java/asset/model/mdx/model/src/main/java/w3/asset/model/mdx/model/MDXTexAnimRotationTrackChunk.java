package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXTexAnimRotationTrackChunk extends MDXTracksChunk<MDXTexAnimRotationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KTAR");
    }

    private List<MDXTexAnimRotationTrack> tracks;

    @Override
    public List<MDXTexAnimRotationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXTexAnimRotationTrack> tracks) {
        this.tracks = tracks;
    }
}
