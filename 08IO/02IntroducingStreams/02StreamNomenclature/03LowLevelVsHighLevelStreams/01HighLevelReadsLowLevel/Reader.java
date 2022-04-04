import java.io.*;
public class Reader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (
            BufferedReader bufferedReader = new BufferedReader(
                new FileReader("/home/jbennett/zoo.txt"))) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
