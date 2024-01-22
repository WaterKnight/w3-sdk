package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXCameraRotationTrackChunk extends MDXTracksChunk<MDXCameraRotationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KCRL");
    }

    private List<MDXCameraRotationTrack> tracks;

    @Override
    public List<MDXCameraRotationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXCameraRotationTrack> tracks) {
        this.tracks = tracks;
    }
}
