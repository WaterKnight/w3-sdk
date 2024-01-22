package w3.common.cli;

import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(
        name = "convert"
)
public abstract class AbstractConvertCommand implements Runnable {
    @CommandLine.Option(names = {"--inputFile", "-i"}, required = true)
    protected String inputFile;

    @CommandLine.Option(names = {"--outputFile", "-o"}, required = true)
    protected String outputFile;
}