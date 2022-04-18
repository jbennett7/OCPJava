import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get("/home/jbennett/Work/OCPJava");
        try {
            Files.walk(path)
                .filter(p -> p.toString().endsWith(".class"))
                .forEach(System.out::println);
        } catch(java.io.IOException e) {
            System.out.println(e);
        }
    }
}
