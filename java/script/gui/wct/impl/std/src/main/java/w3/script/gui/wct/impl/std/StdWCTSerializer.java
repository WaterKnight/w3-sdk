package w3.script.gui.wct.impl.std;

import wc3.script.gui.wct.model.EncodingFormat;
import wc3.script.gui.wct.model.WCT;
import w3.common.core.Wc3BinOutputStream;
import w3.script.gui.wct.api.WCTSerializer;

public class StdWCTSerializer implements WCTSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdWCTSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(WCT data) {

    }
}
