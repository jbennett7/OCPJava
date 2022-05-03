import java.io.*;
public class Question {
    public static void main(String[] args) {
        String line;
        Console c = System.console();
        if ((line = c.readLine()) != null)
            System.out.println(line);
    }
}
