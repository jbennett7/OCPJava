import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        System.out.println(
            Files.isReadable(Paths.get("/home/jbennett/.bashrc")));
        System.out.println(
            Files.isExecutable(Paths.get("/bin/zip")));
    }
}
