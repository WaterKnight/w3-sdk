package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXParticleEmitterEmissionRateTrackSerializer;
import w3.asset.model.mdx.model.MDXParticleEmitterEmissionRateTrack;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXParticleEmitterEmissionRateTrackSerializer extends StdMDXTrackSerializer<MDXParticleEmitterEmissionRateTrack, MDXParticleEmitterEmissionRateTrack.EmissionRate> implements MDXParticleEmitterEmissionRateTrackSerializer {
    public StdMDXParticleEmitterEmissionRateTrackSerializer(Wc3BinOutputStream outputStream) {
        super(outputStream, (emissionRate) -> {
            outputStream.writeFloat32(emissionRate.getValue());
        });
    }
}
