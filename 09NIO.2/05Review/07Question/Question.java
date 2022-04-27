import java.nio.file.*;
import java.io.*;
public class Question {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("turkey");
        if(Files.isSameFile(path,Paths.get(
            System.getProperty("user.dir") + "/turkey")));
            Files.createDirectory(path.resolve("info"));
    }
}
