import java.nio.file.*;
import java.nio.file.attribute.FileTime;
public class PathTest {
    public static void main(String[] args) {
        try {
            final Path path = Paths.get("/home/jbennett/zoo.txt");
            System.out.println(Files.getLastModifiedTime(path).toMillis());
            Files.setLastModifiedTime(path,
                FileTime.fromMillis(System.currentTimeMillis()));
            System.out.println(Files.getLastModifiedTime(path).toMillis());
        } catch(java.io.IOException e) {
            System.out.println(e);
        }
    }
}
