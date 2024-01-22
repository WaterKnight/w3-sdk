package w3.asset.model.mdx.impl.std;

public class StdMDXRibbonEmitterVisibilityTrackChunkSerializer extends StdMDXTrackChunkSerializer {
    public final static Id TOKEN = Id.valueOf("KRVS");

    @Override
    public Id getToken() {
        return TOKEN;
    }
}
