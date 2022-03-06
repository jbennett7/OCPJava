import java.util.stream.*;
import java.util.*;
public class Nums {
    public static int max (IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }
    
    public static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax()-stats.getMin();
    }

    public static void main(String[] args) {
        IntStream ints = IntStream.rangeClosed(1,10);
        System.out.println(max(ints));
        IntStream ints2 = IntStream.rangeClosed(1,10);
        System.out.println(range(ints2));
    }
}
