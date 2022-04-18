import java.io.*;
public class Question {
    public static void main(String[] args) {
    }
    public static void deleteTree(File file) {
        if(!file.isFile())
            for(File entry: file.listFiles())
                deleteTree(entry);
        else file.delete();
    }
}
