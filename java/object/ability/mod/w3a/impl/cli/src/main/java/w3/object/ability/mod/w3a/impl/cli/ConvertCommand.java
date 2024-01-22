package w3.object.ability.mod.w3a.impl.cli;

import w3.common.cli.AbstractConvertCommand;
import w3.common.cli.AbstractConverter;

import java.io.File;

public class ConvertCommand extends AbstractConvertCommand {
    @Override
    public void run() {
        final Converter converter = new Converter(new File(inputFile), new File(outputFile));
        converter.convert();
    }
}
