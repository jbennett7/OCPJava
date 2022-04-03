import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;
public class Oz {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingByConcurrent(String::length));
        System.out.println(map);
    }
}
