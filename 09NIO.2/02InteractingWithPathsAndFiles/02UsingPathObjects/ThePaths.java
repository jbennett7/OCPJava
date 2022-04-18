import java.nio.file.Paths;
public class ThePaths {
    public static void main(String[] args) {
        String path = "/home/jbennett/zoo.txt";
        System.out.println(Paths.get(path)
            .getParent()
            .normalize()
            .toAbsolutePath());
    }
}
