import java.util.*;
import java.io.FileNotFoundException;
public class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
    public static void main(String[] args) {
        // A
        Helper.printException(new FileNotFoundException("A"));
        // B
        Helper.printException(new Exception("B"));
        // C Works if the above was <U extends Throwable>
        //Helper.<Throwable>printException(new Exception("C"));
        // D
        Helper.<NullPointerException>printException(new NullPointerException("D"));
        // E Works if the above was <U extends Throwable>
        //Helper.printException(new Throwable("E"));
    }
}

