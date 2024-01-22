package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightColorTrackChunk extends MDXTracksChunk<MDXLightColorTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KLAC");
    }

    private List<MDXLightColorTrack> tracks;

    @Override
    public List<MDXLightColorTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLightColorTrack> tracks) {
        this.tracks = tracks;
    }
}
