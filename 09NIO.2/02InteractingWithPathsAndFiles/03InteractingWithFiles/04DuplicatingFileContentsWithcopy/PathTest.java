import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        try {
            Files.copy(Paths.get("/home/jbennett/zoo.txt"),
                Paths.get("./zoo.txt"));
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
