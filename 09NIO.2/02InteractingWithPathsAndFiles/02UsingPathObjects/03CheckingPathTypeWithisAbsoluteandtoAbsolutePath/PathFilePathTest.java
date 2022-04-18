import java.nio.file.*;
public class PathFilePathTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/jbennett/zoo.txt");
        System.out.println("Path1 is Absolute? "+path1.isAbsolute());
        System.out.println("Absolute Path1: "+path1.toAbsolutePath());

        Path path2 = Paths.get("../ThePaths.java");
        System.out.println("Path2 is Absolute? "+path2.isAbsolute());
        System.out.println("Absolute Path2: "+path2.toAbsolutePath());
    }
}
