import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;
public class Wolf {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w","o","l","f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add,
            Set::addAll);
        System.out.println(set);
    }
}
