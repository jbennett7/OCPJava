import java.util.*;
import java.util.stream.*;

public class Grouping {
    private static void tryOne() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map);
        System.out.println();
    }
    private static void tryTwo() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(map);
        System.out.println(map.getClass());
        System.out.println();
    }
    private static void tryThree() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map);
        System.out.println(map.getClass());
    }
    public static void main(String[] args) {
        tryOne();
        tryTwo();
        tryThree();
    }
}
