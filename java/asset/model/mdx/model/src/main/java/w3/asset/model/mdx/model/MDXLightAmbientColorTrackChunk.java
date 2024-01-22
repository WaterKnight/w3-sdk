package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightAmbientColorTrackChunk extends MDXTracksChunk<MDXLightAmbientColorTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KLBC");
    }

    private List<MDXLightAmbientColorTrack> tracks;

    @Override
    public List<MDXLightAmbientColorTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLightAmbientColorTrack> tracks) {
        this.tracks = tracks;
    }
}
