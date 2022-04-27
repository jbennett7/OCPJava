import java.io.*;
import java.nio.file.*;
public class Question {

    private static String lString = "kang";
    private static String dString = "mammal/kangaroo";

    private static void mkDir() {
        Path path = Paths.get(dString);
        try {
            Files.createDirectories(path);
        } catch(IOException e) {
            System.err.println("Failed to create directory!"
                    + e.getMessage());
        }
    }

    private static void deleteDir() {
        Path path = Paths.get(dString);
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null) {
            try {
                if(Files.isDirectory(currentParent))
                    Files.delete(currentParent);
            } catch(IOException e) {
                System.err.println("Failed to delete directory!: "
                        + e.getMessage());
            }
        }
    }

    private static void mkLink() {
        Path link = Paths.get(lString);
        Path target = Paths.get(dString);
        try {
            Files.createSymbolicLink(link, target);
        } catch(IOException e) {
            System.err.println("Failed to create Symbolic Link!: "
                    + e.getMessage());
        }
    }

    private static void deleteLink() {
        Path link = Paths.get(lString);
        try {
            Files.delete(link);
        } catch(IOException e) {
            System.err.println("Failed to delete Symbolic Link!: "
                    + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        /*
        Path path = Paths.get(lString);
        mkDir();
        mkLink();
        if(Files.isDirectory(path) && Files.isSymbolicLink(path))
            Files.createDirectory(path.resolve("joey"));
        System.out.println(
                Files.isDirectory(path.resolve("joey")) ? 
                    "Success" :
                    "Try Again");
        try {
            Files.delete(path.resolve("joey")); 
        } catch (IOException e) {
            System.err.println("Failed to delete joey: " + e.getMessage());
        }
        deleteLink();
        */
        mkDir();
        deleteDir();
    }
}
