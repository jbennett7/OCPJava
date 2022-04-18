import java.util.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.io.*;
public class PathTest {
    private static void writeFile(String p, String s) {
        Path path = Paths.get(p);
        List<String> data = new ArrayList();
        try (BufferedWriter writer = Files.newBufferedWriter(path,
            Charset.forName("US-ASCII"))) {
            writer.write(s);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    private static void readFile(String p) {
        Path path = Paths.get(p);
        try (BufferedReader reader =
            Files.newBufferedReader(path, Charset.forName("US-ASCII"))) {
            String currentLine = null;
            while((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        String readF = "/home/jbennett/zoo.txt";
        String writeF = "foo.txt";
        readFile(readF);
        writeFile(writeF, "FooBarBingBang");
        readFile(writeF);
    }
}
