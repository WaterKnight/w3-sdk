package w3.save.w3v.impl.cli;

import picocli.CommandLine;
import w3.common.cli.AbstractConvertCommand;

import java.io.File;

public class ConvertCommand extends AbstractConvertCommand {
    @CommandLine.Option(names = {"--target-version", "-tv"})
    protected Integer targetVersion;

    @CommandLine.Option(names = {"--decompress", "-dec"}, defaultValue = "true")
    protected boolean decompress;

    @CommandLine.Option(names = {"--compress", "-c"}, defaultValue = "true")
    protected boolean compress;

    @Override
    public void run() {
        final Converter converter = new Converter(new File(inputFile), new File(outputFile), targetVersion, decompress, compress);
        converter.convert();
    }
}
