import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!!!!!");
        System.out.println("Hello, World!!!!!");
    }

    private static void extractFile(Path zipFile, String fileName, Path outputFile) throws IOException {
        try (var fileSystem = FileSystems.newFileSystem(zipFile, (ClassLoader) null)) {
            var fileToExtract = fileSystem.getPath(fileName);
            Files.copy(fileToExtract, outputFile);
        }
    }
}
