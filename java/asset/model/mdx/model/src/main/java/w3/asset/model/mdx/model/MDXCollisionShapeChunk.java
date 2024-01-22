package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXCollisionShapeChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("CLID");
    }

    private List<MDXCollisionShape> collisionShapes;

    public List<MDXCollisionShape> getCollisionShapes() {
        return collisionShapes;
    }

    public void setCollisionShapes(List<MDXCollisionShape> collisionShapes) {
        this.collisionShapes = collisionShapes;
    }
}
