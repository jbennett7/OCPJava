import java.nio.file.*;
public class PathFilePathTest {
    public static void main(String[] args) {
        Path path = Paths.get("/home/jbennett/zoo.txt");
        System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
        System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
        System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2));
        System.out.println("Subpath from 1 to 1 is: "+path.subpath(1,1));
        System.out.println("Subpath from 0 to 4 is: "+path.subpath(0,4));

    }
}
