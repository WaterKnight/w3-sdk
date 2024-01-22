package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXGeosetAnimAlphaTrackChunk extends MDXTracksChunk<MDXGeosetAnimAlphaTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KGAO");
    }

    private List<MDXGeosetAnimAlphaTrack> tracks;

    @Override
    public List<MDXGeosetAnimAlphaTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXGeosetAnimAlphaTrack> tracks) {
        this.tracks = tracks;
    }
}
