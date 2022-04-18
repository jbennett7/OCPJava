import java.nio.file.*;
import java.nio.file.attribute.*;
public class PathTest {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/home/jbennett/zoo.txt");
            System.out.println(Files.getOwner(path).getName());
            UserPrincipal owner = path.getFileSystem()
                .getUserPrincipalLookupService()
                .lookupPrincipalByName("jbennett");
            Files.setOwner(path, owner);
            System.out.println(Files.getOwner(path).getName());
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
