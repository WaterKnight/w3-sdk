package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXCameraRotationTrackSerializer;
import w3.asset.model.mdx.model.MDXCameraRotationTrack;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXCameraRotationTrackSerializer extends StdMDXTrackSerializer<MDXCameraRotationTrack, MDXCameraRotationTrack.Quaternion> implements MDXCameraRotationTrackSerializer {
    public StdMDXCameraRotationTrackSerializer(Wc3BinOutputStream outputStream) {
        super(outputStream, (quaternion) -> {
            outputStream.writeFloat32(quaternion.getX());
            outputStream.writeFloat32(quaternion.getY());
            outputStream.writeFloat32(quaternion.getZ());
            outputStream.writeFloat32(quaternion.getA());
        });
    }
}
