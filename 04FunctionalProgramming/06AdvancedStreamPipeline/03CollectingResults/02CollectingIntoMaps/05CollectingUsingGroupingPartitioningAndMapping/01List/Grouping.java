import java.util.*;
import java.util.stream.*;

public class Grouping {
    private static void tryOne() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map);
    }
    public static void main(String[] args) {
        tryOne();
    }
}
