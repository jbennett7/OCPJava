import java.nio.file.*;
public class Question {
    public static void main(String[] args) {
        Path path = Paths.get("/user/.././root","../kodiacbear.txt");
        System.out.println(
            path.normalize().relativize(Paths.get("/lion")));
        System.out.println(path);
    }
}
