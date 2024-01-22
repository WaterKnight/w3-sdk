package w3.object.collection.mod.w3o.impl.cli;

import picocli.CommandLine;
import w3.common.cli.AbstractConvertCommand;

import java.io.File;

public class ConvertCommand extends AbstractConvertCommand {
    @CommandLine.Option(names = {"--target-version", "-tv"})
    protected Integer targetVersion;

    @CommandLine.Option(names = {"--target-object-version", "-tov"})
    protected Integer targetObjectVersion;

    @Override
    public void run() {
        final Converter converter = new Converter(new File(inputFile), new File(outputFile), targetVersion, targetObjectVersion);
        converter.convert();
    }
}
