import java.util.*;
import java.util.stream.*;

public class MapStream {
    private static void tryOne() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = ohMy.collect(
                Collectors.toMap(String::length, k -> k));
        System.out.println(map);
    }
    public static void main(String[] args) {
        tryOne();
    }
}
