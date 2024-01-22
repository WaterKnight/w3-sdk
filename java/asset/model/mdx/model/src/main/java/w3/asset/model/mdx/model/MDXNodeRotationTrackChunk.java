package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXNodeRotationTrackChunk extends MDXTracksChunk<MDXNodeRotationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KGRT");
    }

    private List<MDXNodeRotationTrack> tracks;

    @Override
    public List<MDXNodeRotationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXNodeRotationTrack> tracks) {
        this.tracks = tracks;
    }
}
