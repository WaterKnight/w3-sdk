package w3.info.mmp.api;

import w3.common.api.Serializer;
import w3.info.mmp.model.MMP;

public interface MMPSerializer extends Serializer<MMP> {
    void serialize(MMP mmp);
}
