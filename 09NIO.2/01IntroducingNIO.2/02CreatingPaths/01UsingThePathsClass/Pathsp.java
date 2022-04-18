import java.nio.file.Paths;
import java.nio.file.Path;
import java.net.URI;
public class Pathsp {
    public static void main(String[] args) {
        Path path1 = Paths.get("/home/jbennett/zoo.txt");
        Path path2 = Paths.get("/","home","jbennett","zoo.txt");
        Path path3 = Paths.get(new URI("file:///home/jbennett/zoo.txt"));
    }
}
