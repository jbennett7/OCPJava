import java.io.*;
public class Question {
    public static void main(String[] args) throws IOException {
        InputStream is = new BufferedInputStream(
                new FileInputStream("zoo.txt"));
        InputStream wrappera = new BufferedInputStream(is);
        //InputStream wrapperb = new FileInputStream(is);
        //InputStream wrapperc = new BufferedWriter(is);
        InputStream wrapperd = new ObjectInputStream(is);
        //InputStream wrappere = new ObjectOutputStream(is);
        //InputStream wrapperf = new BufferedReader(is);
    }
}
