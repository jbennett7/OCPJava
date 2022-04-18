import java.io.IOException;
import java.nio.file.*;
import java.util.stream.*;
public class PathTest {
    private static void printContents1(Path p) {
        try {
            Files.lines(p).forEach(System.out::println);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    private static void printContents2(Path p) {
        try {
            System.out.println(Files.lines(p)
                .filter(s -> s.startsWith("# "))
                .map(s -> s.substring(5))
                .collect(Collectors.toList()));
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get("/home/jbennett/.bashrc");
        printContents2(path);
    }
}
