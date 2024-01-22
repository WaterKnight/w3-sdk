package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2VariationTrackChunk extends MDXTracksChunk<MDXParticleEmitter2VariationTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KP2R");
    }

    private List<MDXParticleEmitter2VariationTrack> tracks;

    @Override
    public List<MDXParticleEmitter2VariationTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2VariationTrack> tracks) {
        this.tracks = tracks;
    }
}
