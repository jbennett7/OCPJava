import java.io.*;
public class Printer {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("zoo.log");
        out.print(5);
        out.write(String.valueOf(5));
        out.print(2.0);
        out.write(String.valueOf(2.0));
        Animal animal = new Animal();
        out.print(animal);
        out.write(animal==null ? "null": animal.toString());
    }
}
