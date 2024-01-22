package w3.common.test;

import w3.common.core.FileUtil;

import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestFileUtil {
    public static List<Path> getFilesWithExtension(FileSystem fileSystem, String directory, String extension) {
        try {
            final List<Path> paths = new ArrayList<>();

            final Path directoryPath = fileSystem.getPath(directory);
            try (final var fileWalker = Files.walk(directoryPath, 1)) {
                final var iterator = fileWalker.iterator();
                iterator.forEachRemaining(path -> {
                    if (Objects.equals(FileUtil.getFileExtension(path), extension)) {
                        paths.add(path);
                    }
                });
            }

            return paths;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}
