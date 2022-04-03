import java.util.*;
import java.util.stream.*;
public class ZooManager {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
        Stream<Integer> parallelStream = stream.parallel();
    }
}
