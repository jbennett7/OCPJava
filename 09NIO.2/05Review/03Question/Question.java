import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.nio.file.attribute.*;
public class Question {
    public static void main(String[] args) {
        Path path = Paths.get("sloth.schedule");
        try (BufferedWriter writer = Files.newBufferedWriter(path,
                    Charset.forName("US-ASCII"))) {
            writer.write("Foobar\nBingBang");
        } catch(IOException e) {
            System.out.println(e);
        }
        try {
            BasicFileAttributes attributes = Files.readAttributes(path,
                    BasicFileAttributes.class);
            if(attributes.size()>0 && 
                    attributes.creationTime().toMillis()>0) {
                System.out.println("FOOOOOOOOO");
                System.out.println(attributes.creationTime());
            }
            Files.delete(path);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
