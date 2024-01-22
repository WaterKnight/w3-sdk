package w3.object.buff.mod.w3h.impl.cli;

import w3.common.cli.AbstractConvertCommand;

import java.io.File;

public class ConvertCommand extends AbstractConvertCommand {
    @Override
    public void run() {
        final Converter converter = new Converter(new File(inputFile), new File(outputFile));
        converter.convert();
    }
}
