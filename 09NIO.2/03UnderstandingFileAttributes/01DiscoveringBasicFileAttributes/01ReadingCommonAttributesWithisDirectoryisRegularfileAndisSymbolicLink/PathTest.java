import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        System.out.println(
            Files.isDirectory(Paths.get("/home/jbennett")));
        System.out.println(
            Files.isRegularFile(Paths.get("/home/jbennett/zoo.txt")));
        System.out.println(
            Files.isSymbolicLink(Paths.get("/home/jbennett/file.txt")));
    }
}
