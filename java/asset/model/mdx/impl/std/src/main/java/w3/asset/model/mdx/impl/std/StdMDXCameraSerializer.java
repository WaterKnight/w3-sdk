package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXCameraSerializer;
import w3.asset.model.mdx.api.MDXChunkSerializer;
import w3.asset.model.mdx.model.MDXCamera;
import w3.asset.model.mdx.model.MDXChunk;
import w3.common.core.Wc3BinOutputStream;

import java.util.*;

public class StdMDXCameraSerializer implements MDXCameraSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXChunkSerializer chunkSerializer;

    public StdMDXCameraSerializer(Wc3BinOutputStream outputStream, MDXChunkSerializer chunkSerializer) {
        this.outputStream = outputStream;
        this.chunkSerializer = chunkSerializer;
    }

    @Override
    public void serialize(MDXCamera data) {

    }

    private void write_0x0(MDXCamera camera) {
        //stream.writeUInt32(_inclusiveSize);
        final MDXChunkSizeWriter sizeWriter = new MDXChunkSizeWriter(outputStream);

        sizeWriter.write(outputStream);

        outputStream.writeBytes(Arrays.copyOf(camera.getName().getBytes(), 80));

        outputStream.writeFloat32(camera.getX());
        outputStream.writeFloat32(camera.getY());
        outputStream.writeFloat32(camera.getZ());

        outputStream.writeFloat32(camera.getFieldOfView());
        outputStream.writeFloat32(camera.getFarClippingPlane());
        outputStream.writeFloat32(camera.getNearClippingPlane());

        outputStream.writeFloat32(camera.getTargetX());
        outputStream.writeFloat32(camera.getTargetY());
        outputStream.writeFloat32(camera.getTargetZ());

        for (MDXChunk chunk : camera.getChunks()) {
            chunkSerializer.serialize(chunk);
        }

        sizeWriter.rewrite();
    }
}
