package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightIntensityTrackChunk extends MDXTracksChunk<MDXLightIntensityTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KLAI");
    }

    private List<MDXLightIntensityTrack> tracks;

    @Override
    public List<MDXLightIntensityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLightIntensityTrack> tracks) {
        this.tracks = tracks;
    }
}
