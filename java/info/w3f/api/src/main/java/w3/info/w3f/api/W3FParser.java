package w3.info.w3f.api;

import w3.common.api.Parser;
import w3.info.w3f.model.W3F;
import w3.info.w3f.model.W3W3f;

public interface W3FParser extends Parser<W3F> {
    W3F parse();
}
