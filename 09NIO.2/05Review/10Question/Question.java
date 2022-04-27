import java.nio.charset.*;
import java.nio.file.*;
import java.io.*;
public class Question {
    private static String source = "monkey.txt";
    private static String target = "animals";

    private static void createMonkeyFile() {
        Path path = Paths.get(source);
        if(!Files.exists(path))
            try(BufferedWriter writer = Files.newBufferedWriter(path,
                        Charset.forName("US-ASCII"))) {
                writer.write("Monkey Business!\n");
            } catch (IOException e) {
                System.out.println("Error");
            }
    }

    private static void readFile(String f) {
        Path path = Paths.get(f);
        if(Files.exists(path))
            try(BufferedReader reader = Files.newBufferedReader(path,
                        Charset.forName("US-ASCII"))) {
                String currentLine = null;
                while((currentLine = reader.readLine()) != null)
                    System.out.println(currentLine);
            } catch (IOException e) {
                System.out.println("Error");
            }
    }

    private static void deleteMonkeyFile() {
        Path path = Paths.get(source);
        if(Files.exists(path))
            try {
                Files.delete(path);
            } catch(IOException e) {
                System.out.println("Error");
            }
    }

    private static void deleteTarget() {
        Path path = Paths.get(target);
        if(Files.exists(path))
            try {
                Files.delete(path);
            } catch(IOException e) {
                System.out.println("Error");
            }
    }

    public static void main(String[] args) throws IOException {
        createMonkeyFile();
        readFile(source);
        Files.move(Paths.get(source), Paths.get(target),
            StandardCopyOption.ATOMIC_MOVE,
            LinkOption.NOFOLLOW_LINKS);
        readFile(target);
        deleteTarget();
        deleteMonkeyFile();
    }
}
