import java.util.*;
import java.util.stream.*;
public class Wolf {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w","o","l","f").parallel();
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);
    }
}
