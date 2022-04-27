import java.nio.file.*;
import java.net.*;
public class Question {
    public static void main(String[] args) throws URISyntaxException {
        //Path path = new Path("jaguar.txt");
        FileSystems.getDefault().getPath("puma.txt");
        Paths.get(new URI("file:///cheetah.txt"));
        Paths.get("cats","lynx.txt");
        new java.io.File("tiger.txt").toPath();
        //Path path = new FileSystem().getPath("leopard");
        Paths.get("ocelot.txt");
    }
}
