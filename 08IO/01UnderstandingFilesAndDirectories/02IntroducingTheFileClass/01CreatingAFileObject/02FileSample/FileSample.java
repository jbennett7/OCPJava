import java.io.File;
public class FileSample {
    public static void main(String[] args) {
        File file = new File("/home/jbennett/zoo.txt");
        System.out.println(file.exists());

        File parent = new File("/home/jbennett");
        File child = new File(parent, "foo.txt");
        File child2 = new File(parent, "Zoo.txt");
        System.out.println(child.exists());
    }
}
