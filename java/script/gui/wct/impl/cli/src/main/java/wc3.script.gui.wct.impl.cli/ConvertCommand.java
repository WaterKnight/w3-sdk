package wc3.script.gui.wct.impl.cli;

import picocli.CommandLine;
import w3.common.cli.AbstractConvertCommand;

import java.io.File;

public class ConvertCommand extends AbstractConvertCommand {
    @CommandLine.Option(names = {"--target-version", "-tv"})
    protected Integer targetVersion;

    @CommandLine.Option(names = {"--decompress", "-dec"}, defaultValue = "true")
    protected boolean decompress;

    @Override
    public void run() {
        final Converter converter = new Converter(new File(inputFile), new File(outputFile), targetVersion, decompress);
        converter.convert();
    }
}
