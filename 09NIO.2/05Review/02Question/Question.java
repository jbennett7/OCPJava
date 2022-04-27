import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;
public class Question {
    private static String pString = "./foo";
    
    public static void mkDir() {
        Path path = Paths.get(pString);
        try {
            if(!Files.isDirectory(path))
                Files.createDirectory(path);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public static void testFile() {
        String content = "Hello World\n\nFoobar!\n";
        Path path = Paths.get(pString+"/testfile.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path,
                Charset.forName("US-ASCII"))) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void deleteTestFile() {
        Path path = Paths.get(pString+"/testfile.txt");
        try {
            if(Files.exists(path))
                Files.delete(path);
        } catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(pString);
        mkDir();
        testFile();
        try {
            if(Files.isDirectory(path))
                System.out.println(Files.deleteIfExists(path) ? 
                    "Success": "Try Again");
        } catch(DirectoryNotEmptyException e) {
            System.out.println(e);
            deleteTestFile();
            if(Files.isDirectory(path))
                System.out.println(Files.deleteIfExists(path) ? 
                    "Success": "Try Again");
        }
    }
}
