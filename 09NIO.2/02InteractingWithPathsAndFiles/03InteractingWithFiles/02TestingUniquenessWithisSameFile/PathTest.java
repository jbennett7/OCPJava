import java.nio.file.*;
import java.io.*;
public class PathTest {
    public static void main(String[] args) {
        String path1 = "/home/jbennett/zoo.txt";
        String path2 = "/home/jbennett/file.txt";
        String path3 = "~/file.txt";
        String path4 = "../../../../../../zoo.txt";
        try {
            System.out.println(Files.isSameFile(Paths.get(path1),
                Paths.get(path2)));
            System.out.println(Files.isSameFile(Paths.get(path2),
                Paths.get(path4)));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
