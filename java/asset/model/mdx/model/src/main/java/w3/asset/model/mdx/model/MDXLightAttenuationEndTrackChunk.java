package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightAttenuationEndTrackChunk extends MDXTracksChunk<MDXLightAttenuationEndTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KLAE");
    }

    private List<MDXLightAttenuationEndTrack> tracks;

    @Override
    public List<MDXLightAttenuationEndTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLightAttenuationEndTrack> tracks) {
        this.tracks = tracks;
    }
}
