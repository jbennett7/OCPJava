import java.util.*;
import java.util.stream.*;

public class MapStream {
    private static void tryOne() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
            String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map);
        System.out.println(map.getClass());
    }
    public static void main(String[] args) {
        tryOne();
    }
}
