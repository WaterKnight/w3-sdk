package w3.asset.model.mdx.model;

import w3.common.core.Id;

import java.util.List;

public class MDXEventObjectChunk implements MDXChunk {
    @Override
    public Id getToken() {
        return Id.valueOf("EVTS");
    }

    private List<MDXEventObject> eventObjects;

    public List<MDXEventObject> getEventObjects() {
        return eventObjects;
    }

    public void setEventObjects(List<MDXEventObject> eventObjects) {
        this.eventObjects = eventObjects;
    }
}
