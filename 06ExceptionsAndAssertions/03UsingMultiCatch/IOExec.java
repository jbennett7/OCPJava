import java.lang.ArrayIndexOutOfBoundsException;
import java.io.IOException;

public class IOExec {
    public static void main(String[] args) throws IOException {
        try {
            String reader = new String("foo");
            if(reader.equals(args[0]))
                System.out.println("Foobar");
            else
                System.out.println("Not Found");
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new IOException("<<<<<FOOBAR>>>>>");
        }
    }
}
