import java.util.*;
public class Second {
    public static void main(String[] args) {
        String[] array = { "gerbil", "mouse" };
        List<String> list = Arrays.asList(array);
        list.set(1, "test");
        array[0] = "new";
        String[] array2 = (String[]) list.toArray();
        list.remove(1); // throws UnsupportedOperationException
    }
}
