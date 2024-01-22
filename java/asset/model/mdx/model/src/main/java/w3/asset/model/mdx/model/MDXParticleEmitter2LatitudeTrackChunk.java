package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2LatitudeTrackChunk extends MDXTracksChunk<MDXParticleEmitter2LatitudeTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KP2L");
    }

    private List<MDXParticleEmitter2LatitudeTrack> tracks;

    @Override
    public List<MDXParticleEmitter2LatitudeTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2LatitudeTrack> tracks) {
        this.tracks = tracks;
    }
}
