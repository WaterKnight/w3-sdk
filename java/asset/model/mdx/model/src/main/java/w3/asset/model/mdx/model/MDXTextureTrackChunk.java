package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXTextureTrackChunk extends MDXTracksChunk<MDXTextureTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KMTF");
    }

    private List<MDXTextureTrack> tracks;

    @Override
    public List<MDXTextureTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXTextureTrack> tracks) {
        this.tracks = tracks;
    }
}
