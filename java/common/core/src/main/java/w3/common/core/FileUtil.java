package w3.common.core;

import java.io.File;
import java.nio.file.Path;

public class FileUtil {
    public static String getFileExtension(File file) {
        final String[] segments = file.getName().split("[.]");
        return segments[segments.length - 1];
    }

    public static String getFileExtension(Path file) {
        final String[] segments = file.toString().split("[.]");
        return segments[segments.length - 1];
    }
}
