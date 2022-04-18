import java.nio.file.*;
import java.util.stream.*;
public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get("/home/jbennett/Work/OCPJava");
        long dateFilter = 1420070400000l;

        try {
            Stream<Path> stream = Files.find(path, 10,
                (p,a) -> p.toString().endsWith(".class")
                  && a.lastModifiedTime().toMillis()>dateFilter);
            stream.forEach(System.out::println);
        } catch(java.io.IOException e) {
            System.out.println(e);
        }
    }
}
