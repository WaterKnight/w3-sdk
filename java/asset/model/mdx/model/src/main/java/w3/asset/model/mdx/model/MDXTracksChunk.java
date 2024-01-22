package w3.asset.model.mdx.model;

import java.util.List;

public abstract class MDXTracksChunk<TrackType extends MDXTrack<?>> implements MDXChunk {
    public abstract List<TrackType> getTracks();

    private MDXTrack.InterpolationType interpolationType;

    private long globalSequenceId;

    public MDXTrack.InterpolationType getInterpolationType() {
        return interpolationType;
    }

    public void setInterpolationType(MDXTrack.InterpolationType interpolationType) {
        this.interpolationType = interpolationType;
    }

    public long getGlobalSequenceId() {
        return globalSequenceId;
    }

    public void setGlobalSequenceId(long globalSequenceId) {
        this.globalSequenceId = globalSequenceId;
    }
}
