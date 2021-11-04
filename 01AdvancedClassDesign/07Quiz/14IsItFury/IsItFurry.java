/* l instanceof Chipmunk does not compile.
 * Code involving instanceof does not compile when there is no way for
 * it to evalutate true. D not only compiles but it is always true. E
 * does not compile because ArrayList is a concrete class that does not
 * extend Chipmunk. F does compile because Runnable is an interface. In
 * theory, someone could subclass Chipmunk and have the subclass
 * implement Runnable.
 */
import java.util.*;
public class IsItFurry {
    static class Chipmunk {}
    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r = new Thread();
        int result = 0;
        if (c instanceof Chipmunk) result += 1;
        if (l instanceof Chipmunk) result += 2;
        if (r instanceof Chipmunk) result += 4;
        System.out.println(result);
    }
}
          
