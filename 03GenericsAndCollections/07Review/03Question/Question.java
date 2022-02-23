import java.util.*;
public class Question {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add(7);
        // This is the original
        /*
        for (String s: list)
            System.out.print(s);
        */
        // This displays a note
        for (Object o: list) {
            if ( o instanceof String )
                System.out.print((String) o);
            if ( o instanceof Integer )
                System.out.print((Integer) o);
        }
    }
}
