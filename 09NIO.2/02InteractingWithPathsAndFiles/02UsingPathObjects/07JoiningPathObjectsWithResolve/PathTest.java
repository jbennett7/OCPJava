import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        final Path path1 = Paths.get("/cats/../panther");
        final Path path2 = Paths.get("food");
        System.out.println(path1.resolve(path2));
        System.out.println();
        final Path path3 = Paths.get("/turkey/food");
        final Path path4 = Paths.get("/tiger/cage");
        System.out.println(path3.resolve(path4));
    }
}
