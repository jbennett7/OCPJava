import java.io.IOException;
import java.util.stream.*;
import java.nio.file.*;
public class Question {
    private static void mkdir(String s) {
        Path path = Paths.get(s);
        try {
            Files.createDirectories(path);
        } catch(IOException e) {
            System.err.println("Unable to create Directory: "
                + e.getMessage());
        }
    }

    private static void delete(Path p) {
        try {
            Files.delete(p);
        } catch(IOException e) {
            System.err.println("Unable to delete file: "
                + e.getMessage());
        }
    }

    private static void rmdir(String s) {
        Path path = Paths.get(s);
        try {
            Files.walk(path).reverse().forEach(Question::delete);
        } catch(IOException e) {
            System.err.println("Unable to delete Directory: "
                + e.getMessage());
        }
    }

    public static void main(String[] args) {
        mkdir("Foo");
        rmdir("Foo");
    }
}
