import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        if(true){
            System.out.println("if statement executed");
        }
    }

    private static void extractFile(Path zipFile, String fileName, Path outputFile) throws IOException {
        try (var fileSystem = FileSystems.newFileSystem(zipFile, (ClassLoader) null)) {
            var fileToExtract = fileSystem.getPath(fileName);
            Files.copy(fileToExtract, outputFile);
            // System.out.print("Print something");

            System.out.print("Print another something");
        }
        System.out.print("Print another something");

        int i =10;

        System.out.print("Print another something");
    }
}
