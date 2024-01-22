package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXGeosetAnimColorTrackChunk extends MDXTracksChunk<MDXGeosetAnimColorTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KGAC");
    }

    private List<MDXGeosetAnimColorTrack> tracks;

    @Override
    public List<MDXGeosetAnimColorTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXGeosetAnimColorTrack> tracks) {
        this.tracks = tracks;
    }
}
