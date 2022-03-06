import java.util.*;
import java.util.stream.*;

public class Partitioning {
    private static void tryOne() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map);
    }
    private static void tryTwo() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5, Collectors.toSet()));
        System.out.println(map);
    }
    private static void tryThree() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(
                    String::length, Collectors.counting()));
        System.out.println(map);
    }
    private static void tryFour() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(s -> s.charAt(0),
                                Collectors.minBy(Comparator.naturalOrder()))));
        System.out.println(map);
    }
    public static void main(String[] args) {
        tryOne();
        tryTwo();
        tryThree();
        tryFour();
    }
}
