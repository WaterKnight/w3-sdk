package w3.common.slk.api;

import w3.common.api.Parser;
import w3.common.slk.model.SlkFile;

public interface SlkFileParser extends Parser<SlkFile> {
    SlkFile parse();
}
