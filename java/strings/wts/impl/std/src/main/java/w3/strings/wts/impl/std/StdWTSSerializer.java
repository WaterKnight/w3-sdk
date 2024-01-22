package w3.strings.wts.impl.std;

import w3.common.core.Wc3BinOutputStream;
import w3.strings.wts.api.WTSSerializer;
import w3.strings.wts.model.WTS;

import javax.annotation.Nonnull;
import java.io.PrintStream;

public class StdWTSSerializer implements WTSSerializer {
    private final PrintStream outputStream;

    public StdWTSSerializer(@Nonnull PrintStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void serialize(WTS wts) {
        write(wts);
    }

    public static final String UTF8_BOM = "\uFEFF";

    private void write(WTS wts) {
        outputStream.print(UTF8_BOM);
        wts.blocks.forEach(block -> {
            outputStream.println("STRING " + block.num);
            outputStream.println(block.text);
        });
    }
}
