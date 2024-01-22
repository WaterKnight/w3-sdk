package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXCameraChunkSerializer;
import w3.asset.model.mdx.api.MDXCameraSerializer;
import w3.asset.model.mdx.model.MDXCamera;
import w3.asset.model.mdx.model.MDXCameraChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXCameraChunkSerializer implements MDXCameraChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXCameraSerializer cameraSerializer;

    public StdMDXCameraChunkSerializer(Wc3BinOutputStream outputStream, MDXCameraSerializer cameraSerializer) {
        this.outputStream = outputStream;
        this.cameraSerializer = cameraSerializer;
    }

    @Override
    public void serialize(MDXCameraChunk data) {
        write(data);
    }

    public void write(MDXCameraChunk cameraChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(cameraChunk);

                break;
        }
    }

    private void write_0x0(MDXCameraChunk cameraChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(cameraChunk.getToken());

        for (MDXCamera camera : cameraChunk.getCameras()) {
            cameraSerializer.serialize(camera);
        }

        header.rewrite();
    }
}
