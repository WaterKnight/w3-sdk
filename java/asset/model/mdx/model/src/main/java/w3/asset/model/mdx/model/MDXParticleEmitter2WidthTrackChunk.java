package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXParticleEmitter2WidthTrackChunk extends MDXTracksChunk<MDXParticleEmitter2WidthTrack> {
    @Override
    public Id getToken() {
        return Id.valueOf("KP2W");
    }

    private List<MDXParticleEmitter2WidthTrack> tracks;

    @Override
    public List<MDXParticleEmitter2WidthTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<MDXParticleEmitter2WidthTrack> tracks) {
        this.tracks = tracks;
    }
}
