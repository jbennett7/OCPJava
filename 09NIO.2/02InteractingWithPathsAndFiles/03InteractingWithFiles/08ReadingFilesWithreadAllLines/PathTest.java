import java.nio.file.*;
import java.util.*;
public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get("/home/jbennett/zoo.txt");
        try {
            final List<String> lines = Files.readAllLines(path);
            for(String line: lines) {
                System.out.println(line);
            }
        } catch(java.io.IOException e) {
            System.out.println(e);
        }
    }
}
