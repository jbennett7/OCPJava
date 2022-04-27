import java.nio.charset.*;
import java.nio.file.*;
import java.io.*;
public class Question {
    private static String source = "./goat.txt";
    private static String target = "mule.png";

    private static void createFile(String s, String c) {
        Path path = Paths.get(s);
        try(BufferedWriter writer = Files.newBufferedWriter(path,
                    Charset.forName("US-ASCII"))) {
            writer.write(c);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    private static void deleteFile(String s) {
        Path path = Paths.get(s);
        try {
            Files.delete(path);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    private static void readFile(String s) {
        Path path = Paths.get(s);
        try(BufferedReader reader = Files.newBufferedReader(path,
                    Charset.forName("US-ASCII"))) {
            String currentLine = null;
            while((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get(source).normalize();
        createFile(source,"Foobar\n");
        Path path2 = Paths.get(target);
        Files.copy(path1,path2,StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println(Files.isSameFile(path1,path2));
    }
}
