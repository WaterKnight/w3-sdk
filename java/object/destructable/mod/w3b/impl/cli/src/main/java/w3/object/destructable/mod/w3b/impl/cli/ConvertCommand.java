package w3.object.destructable.mod.w3b.impl.cli;

import w3.common.cli.AbstractConvertCommand;

import java.io.File;

public class ConvertCommand extends AbstractConvertCommand {
    @Override
    public void run() {
        final Converter converter = new Converter(new File(inputFile), new File(outputFile));
        converter.convert();
    }
}
