package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitterEmissionRateTrackChunk extends MDXTracksChunk<MDXParticleEmitterEmissionRateTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KPEE");
    }

    private List<MDXParticleEmitterEmissionRateTrack> tracks;

    @Override
    public List<MDXParticleEmitterEmissionRateTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitterEmissionRateTrack> tracks) {
        this.tracks = tracks;
    }
}
