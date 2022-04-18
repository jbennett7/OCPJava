import java.nio.file.*;
import java.io.IOException;
public class PathTest {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/home/jbennett");
            Files.list(path)
                .filter(p -> !Files.isDirectory(p))
                .map(p -> p.toAbsolutePath())
                .forEach(System.out::println);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
