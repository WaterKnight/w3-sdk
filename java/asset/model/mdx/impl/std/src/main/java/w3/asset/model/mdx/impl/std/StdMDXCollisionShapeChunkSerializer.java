package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXCollisionShapeChunkSerializer;
import w3.asset.model.mdx.api.MDXCollisionShapeSerializer;
import w3.asset.model.mdx.model.MDXCollisionShape;
import w3.asset.model.mdx.model.MDXCollisionShapeChunk;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXCollisionShapeChunkSerializer implements MDXCollisionShapeChunkSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXCollisionShapeSerializer collisionShapeSerializer;

    public StdMDXCollisionShapeChunkSerializer(Wc3BinOutputStream outputStream, MDXCollisionShapeSerializer collisionShapeSerializer) {
        this.outputStream = outputStream;
        this.collisionShapeSerializer = collisionShapeSerializer;
    }

    @Override
    public void serialize(MDXCollisionShapeChunk data) {

    }

    private void write(MDXCollisionShapeChunk collisionShapeChunk) {
        switch (format.toEnum()) {
            case AUTO:
            case MDX_0x0:
                write_0x0(collisionShapeChunk);

                break;
        }
    }

    private void write_0x0(MDXCollisionShapeChunk collisionShapeChunk) {
        final MDXChunkHeaderWriter header = new MDXChunkHeaderWriter(outputStream);

        header.write(collisionShapeChunk.getToken());

        for (final MDXCollisionShape collisionShape : collisionShapeChunk.getCollisionShapes()) {
            collisionShapeSerializer.serialize(collisionShape);
        }

        header.rewrite();
    }
}
