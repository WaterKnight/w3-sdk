package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightAmbientIntensityTrackChunk extends MDXTracksChunk<MDXLightAmbientIntensityTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KLBI");
    }

    private List<MDXLightAmbientIntensityTrack> tracks;

    @Override
    public List<MDXLightAmbientIntensityTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLightAmbientIntensityTrack> tracks) {
        this.tracks = tracks;
    }
}
