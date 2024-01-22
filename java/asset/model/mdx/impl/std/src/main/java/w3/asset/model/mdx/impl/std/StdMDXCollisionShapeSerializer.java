package w3.asset.model.mdx.impl.std;

import w3.asset.model.mdx.api.MDXCollisionShapeSerializer;
import w3.asset.model.mdx.api.MDXNodeSerializer;
import w3.asset.model.mdx.api.MDXVertexSerializer;
import w3.asset.model.mdx.model.MDXCollisionShape;
import w3.asset.model.mdx.model.MDXVertex;
import w3.common.core.Wc3BinOutputStream;

public class StdMDXCollisionShapeSerializer implements MDXCollisionShapeSerializer {
    private final Wc3BinOutputStream outputStream;
    private final MDXNodeSerializer nodeSerializer;
    private final MDXVertexSerializer vertexSerializer;

    public StdMDXCollisionShapeSerializer(Wc3BinOutputStream outputStream, MDXNodeSerializer nodeSerializer, MDXVertexSerializer vertexSerializer) {
        this.outputStream = outputStream;
        this.nodeSerializer = nodeSerializer;
        this.vertexSerializer = vertexSerializer;
    }

    @Override
    public void serialize(MDXCollisionShape data) {
        write_0x0(data);
    }

    public void write_0x0(MDXCollisionShape collisionShape) {
        nodeSerializer.serialize(collisionShape.getNode());
        outputStream.writeUInt32(collisionShape.getType().ordinal());

        for (MDXVertex vertex : collisionShape.getVertices()) {
            vertexSerializer.serialize(vertex);
        }
    }
}
