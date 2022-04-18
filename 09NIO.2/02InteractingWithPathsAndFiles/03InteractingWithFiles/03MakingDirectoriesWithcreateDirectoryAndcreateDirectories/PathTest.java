import java.nio.file.*;
import java.io.*;
public class PathTest {
    public static void main(String[] args) {
        try {
            Files.createDirectory(Paths.get("./foo"));
        } catch (FileAlreadyExistsException e) {
            System.out.println("Path already exists!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
