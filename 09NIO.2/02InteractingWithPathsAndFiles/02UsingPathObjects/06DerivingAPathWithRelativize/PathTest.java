import java.nio.file.*;
public class PathTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("PathTest.java");
        Path path2 = Paths.get("zoo.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
        System.out.println();

        Path path3 = Paths.get("/home/jbennett/zoo.txt");
        Path path4 = Paths.get("/home/jbennett/Work/AstroEmpires");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));
    }
}
