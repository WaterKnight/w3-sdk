package w3.asset.model.mdx.model;

public class MDXTrack<ValueType> {
    private int frame;

    private ValueType value;

    private ValueType inTanValue;

    private ValueType outTanValue;

    private InterpolationType interpolationType;

    public int getFrame() {
        return frame;
    }

    public void setFrame(int frame) {
        this.frame = frame;
    }

    public ValueType getValue() {
        return value;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }

    public ValueType getInTanValue() {
        return inTanValue;
    }

    public void setInTanValue(ValueType inTanValue) {
        this.inTanValue = inTanValue;
    }

    public ValueType getOutTanValue() {
        return outTanValue;
    }

    public void setOutTanValue(ValueType outTanValue) {
        this.outTanValue = outTanValue;
    }

    public InterpolationType getInterpolationType() {
        return interpolationType;
    }

    public void setInterpolationType(InterpolationType interpolationType) {
        this.interpolationType = interpolationType;
    }

    public enum InterpolationType {
        NONE,
        LINEAR,
        HERMITE,
        BEZIER
    }
}
