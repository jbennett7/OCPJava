import java.util.*;

public class Printing {
    public static void printList(List<?> list) {
        for (Object x: list) System.out.println(x);
    }

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        keywords.add("foobar");
        printList(keywords);
        System.out.println();
        short s = 3;
        List<Number> list = new ArrayList<>();
        list.add(new Long(5));
        list.add(new Short(s));
        System.out.println(total(list));
    }
}
