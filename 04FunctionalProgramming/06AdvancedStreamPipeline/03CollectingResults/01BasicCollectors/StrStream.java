import java.util.*;
import java.util.stream.*;

public class StrStream {
    private static void tryOne() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);
    }
    private static void tryTwo() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result);
    }
    public static void main(String[] args) {
        tryOne();
        tryTwo();
    }
}
