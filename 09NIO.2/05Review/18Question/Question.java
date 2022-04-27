import java.nio.file.*;
import java.io.*;
public class Question {
    public static void main(String[] args) {
        Path path1 = Paths.get("/lizard/./")
            .resolve(Paths.get("walking.txt"));
        Path path2 = new File("/lizard/././actions/../walking.txt").toPath();
        //System.out.print(Files.isSameFile(path1,path2));
        System.out.println(path1);
        System.out.println(path1.equals(path2));
        System.out.println(path1.normalize().equals(path2.normalize()));
        System.out.println(path2);
    }
}
