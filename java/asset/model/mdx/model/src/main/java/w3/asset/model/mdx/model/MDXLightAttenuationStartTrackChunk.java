package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXLightAttenuationStartTrackChunk extends MDXTracksChunk<MDXLightAttenuationStartTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KLAS");
    }

    private List<MDXLightAttenuationStartTrack> tracks;

    @Override
    public List<MDXLightAttenuationStartTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXLightAttenuationStartTrack> tracks) {
        this.tracks = tracks;
    }
}
