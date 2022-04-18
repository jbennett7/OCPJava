import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        try {
            System.out.println(
                Files.size(Paths.get("/home/jbennett/.bashrc")));
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
