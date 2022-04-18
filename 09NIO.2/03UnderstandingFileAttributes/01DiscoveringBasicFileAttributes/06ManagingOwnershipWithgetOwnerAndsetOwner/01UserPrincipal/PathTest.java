import java.nio.file.*;
import java.nio.file.attribute.*;
public class PathTest {
    public static void main(String[] args) {
        try {
            UserPrincipal owner = FileSystems
                .getDefault()
                .getUserPrincipalLookupService()
                .lookupPrincipalByName("jbennett");
            System.out.println(owner);
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
