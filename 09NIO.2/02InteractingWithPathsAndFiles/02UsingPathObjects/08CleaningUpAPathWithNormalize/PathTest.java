import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        Path path3 = Paths.get("/data");
        Path path4 = Paths.get("/usr/home");
        Path relativePath = path3.relativize(path4);
        System.out.println(path3.resolve(relativePath).normalize());
    }
}
