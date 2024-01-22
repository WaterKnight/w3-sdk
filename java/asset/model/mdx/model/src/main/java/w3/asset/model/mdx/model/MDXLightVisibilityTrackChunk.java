package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightVisibilityTrackChunk extends MDXTracksChunk<MDXLightVisibilityTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KLAV");
    }

    private List<MDXLightVisibilityTrack> tracks;

    @Override
    public List<MDXLightVisibilityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLightVisibilityTrack> tracks) {
        this.tracks = tracks;
    }
}
