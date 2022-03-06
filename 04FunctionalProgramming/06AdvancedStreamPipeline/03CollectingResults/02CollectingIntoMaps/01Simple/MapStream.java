import java.util.*;
import java.util.stream.*;

public class MapStream {
    private static void tryOne() {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map);
    }
    public static void main(String[] args) {
        tryOne();
    }
}
