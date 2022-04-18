import java.nio.file.*;
import java.io.*;
public class PathTest {
    public static void main(String[] args) {
        String path1 = "/home/jbennett/zoo.txt";
        try {
            System.out.println(
                Paths.get(path1).toRealPath());
            System.out.println(Paths.get("./PathTest.java").toRealPath());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
