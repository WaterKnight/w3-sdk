package w3.common.slk.api;

import w3.common.api.Serializer;
import w3.common.slk.model.SlkFile;

public interface SlkFileSerializer extends Serializer<SlkFile> {
    void serialize(SlkFile slkFile);
}
