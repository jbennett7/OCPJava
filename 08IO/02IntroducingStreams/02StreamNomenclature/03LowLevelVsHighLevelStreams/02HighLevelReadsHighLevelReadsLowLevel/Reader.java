import java.io.*;
public class Reader {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (
            ObjectInputStream objectStream = new ObjectInputStream(
                new BufferedInputStream(
                    new FileInputStream("/home/jbennett/zoo.txt")))) {
            System.out.println(objectStream.readObject());
        }
    }
}
