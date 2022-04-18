import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        System.out.println(
            Files.exists(Paths.get("/home/jbennett/zoo.txt")));
        System.out.println(
            Files.exists(Paths.get("/home/jbennett/z.txt")));
    }
}
