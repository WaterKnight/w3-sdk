package w3.script.gui.wtg.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.script.gui.wtg.api.WTGSerializer;
import w3.script.gui.wtg.model.EncodingFormat;
import w3.script.gui.wtg.model.WTG;

public class StdWTGSerializer implements WTGSerializer {
    private final Wc3BinOutputStream outputStream;
    private final EncodingFormat format;

    public StdWTGSerializer(Wc3BinOutputStream outputStream, EncodingFormat format) {
        this.outputStream = outputStream;
        this.format = format;
    }

    @Override
    public void serialize(WTG data) {

    }
}
