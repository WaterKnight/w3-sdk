package w3.common.binary.kaitai.extractor;

import picocli.CommandLine;

import java.io.File;

@CommandLine.Command(
        name = "extract"
)
public class ExtractCommand implements Runnable {
    @CommandLine.Option(names = {"--inputDir", "-i"}, required = true)
    private String inputDir;

    @CommandLine.Option(names = {"--outputDir", "-o"}, required = true)
    private String outputDir;

    @CommandLine.Option(names = {"--inputPackageName", "-ipkg"}, required = true)
    private String inputPackageName;

    @CommandLine.Option(names = {"--outputPackageName", "-opkg"}, required = true)
    private String outputPackageName;

    @CommandLine.Option(names = {"--targetClassName", "-tcn"})
    private String targetClassName;

    @Override
    public void run() {
        final Extractor extractor = new Extractor(new File(inputDir), new File(outputDir), inputPackageName, outputPackageName, targetClassName);
        extractor.extract();
    }
}
