package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLifespanTrackChunk extends MDXTracksChunk<MDXLifespanTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KPEL");
    }

    private List<MDXLifespanTrack> tracks;

    @Override
    public List<MDXLifespanTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLifespanTrack> tracks) {
        this.tracks = tracks;
    }
}
