import java.util.*;
import java.io.*;
public class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Helper.<Exception>printException(new FileNotFoundException("A"));
        Helper.<Exception>printException(new Exception("B"));
        //Helper.<NullPointerException>printException(new NullPointerException("D"));
        Helper.<Exception>printException(new NullPointerException("D"));
    }
}
