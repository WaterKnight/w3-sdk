package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXLayerTextureTrackSerializer;
import w3.asset.model.mdx.model.MDXLayerTextureTrack;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXLayerTextureTrackSerializer extends StdMDXTrackSerializer<MDXLayerTextureTrack, MDXLayerTextureTrack.Texture> implements MDXLayerTextureTrackSerializer {
    public StdMDXLayerTextureTrackSerializer(Wc3BinOutputStream outputStream) {
        super(outputStream, (texture) -> {
            outputStream.writeUInt32(texture.getTextureId());
        });
    }
}
