package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2EmissionRateTrackChunk extends MDXTracksChunk<MDXParticleEmitter2EmissionRateTrack> {

    @Override
    public Id getToken() {
        return Id.valueOf("KP2E");
    }

    private List<MDXParticleEmitter2EmissionRateTrack> tracks;

    @Override
    public List<MDXParticleEmitter2EmissionRateTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2EmissionRateTrack> tracks) {
        this.tracks = tracks;
    }
}
