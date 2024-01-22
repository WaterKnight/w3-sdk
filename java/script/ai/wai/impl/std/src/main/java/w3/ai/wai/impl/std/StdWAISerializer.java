package w3.ai.wai.impl.std;

import w3.script.ai.wai.api.WAISerializer;
import w3.script.ai.wai.model.EncodingFormat;
import w3.script.ai.wai.model.WAI;
import w3.common.core.Wc3BinOutputStream;

public class StdWAISerializer implements WAISerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdWAISerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(WAI wai) {
    }
}
