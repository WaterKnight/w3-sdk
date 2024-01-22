package w3.common.slk.generator;

import picocli.CommandLine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class ConvertCommand implements Runnable {
    @CommandLine.Option(names = {"--input-file", "-if"}, required = true)
    private String inputFile;

    @CommandLine.Option(names = {"--output-dir", "-od"}, required = true)
    private String outputDir;

    @CommandLine.Option(names = {"--output-package-name", "-opkg"}, required = true)
    private String outputPackageName;

    @CommandLine.Option(names = {"--output-class-name", "-oclz"}, required = true)
    private String outputClassName;

    @CommandLine.Option(names = {"--output-model-class-name", "-omclz"}, required = true)
    private String outputModelClassName;

    @Override
    public void run() {
        try {
            new Slk2JavaConverter(
                    Files.readAllBytes(new File(inputFile).toPath()),
                    new File(outputDir),
                    outputPackageName,
                    outputClassName,
                    outputModelClassName
            ).convert();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
