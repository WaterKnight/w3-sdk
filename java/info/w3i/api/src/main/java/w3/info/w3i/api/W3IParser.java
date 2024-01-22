package w3.info.w3i.api;

import w3.common.api.Parser;
import w3.info.w3i.model.W3I;

public interface W3IParser extends Parser<W3I> {
    W3I parse();
}
