import java.nio.file.*;
import java.io.*;
public class PathTest {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("/home/jbennett/zoo.txt");
            OutputStream out = new FileOutputStream("bashrc")){

            Files.copy(is, Paths.get("zoo.txt"));
            Files.copy(Paths.get("/home/jbennett/.bashrc"), out);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
