import java.nio.file.FileSystems;
import java.nio.file.Path;
public class AFC {
    public static void main(String[] args) {
        Path path1 = FileSystems.getDefault().getPath(
            "/home/jbennett/zoo.txt");
    }
}
