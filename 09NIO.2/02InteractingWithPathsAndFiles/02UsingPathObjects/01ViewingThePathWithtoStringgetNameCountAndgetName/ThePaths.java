import java.nio.file.Paths;
import java.nio.file.Path;
public class ThePaths {
    public static void main(String[] args) {
        String spath = "/home/jbennett/zoo.txt";
        Path path = Paths.get(spath);
        System.out.println("The path name is: "+path);
        for(int i=0; i<path.getNameCount(); i++) {
            System.out.println("   Element "+i+" is: "+path.getName(i));
        }
    }
}
