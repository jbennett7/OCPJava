import java.io.*;
import java.nio.file.*;
public class Question {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/bats/night","../").resolve(Paths.get("./sleep.txt")).normalize();
        System.out.println(path1);
        Path path2 = new File("../sleep.txt").toPath().toRealPath();

        System.out.println(path2);
        System.out.print(" "+path1.equals(path2));
    }
}
