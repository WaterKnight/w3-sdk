package w3.info.w3f.impl.cli;

import picocli.CommandLine;
import w3.common.cli.AbstractConvertCommand;
import w3.common.cli.AbstractConverter;
import w3.info.w3f.model.W3W3f;

import java.io.File;

public class ConvertCommand extends AbstractConvertCommand {
    @CommandLine.Option(names = {"--target-version", "-tv"})
    protected Integer targetVersion;

    @Override
    public void run() {
        final Converter converter = new Converter(new File(inputFile), new File(outputFile), targetVersion);
        converter.convert();
    }
}
