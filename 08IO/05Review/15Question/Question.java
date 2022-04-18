import java.io.*;
public class Question {
    public static void main(String[] args) throws IOException {
        Question q = new Question();
        q.echo();
    }
    private void echo() throws IOException {
        try (FileReader fileReader = new FileReader("zoo-data.txt");
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader)) {
            System.out.println(bufferedReader.readLine());
            }
    }
}
