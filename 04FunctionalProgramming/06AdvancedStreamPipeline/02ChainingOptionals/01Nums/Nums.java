import java.util.stream.*;
import java.util.*;
public class Nums {
    public static void threeDigit(Optional<Integer> optional) {
        optional.map(n -> "" + n)
            .filter(s -> s.length() == 3)
            .ifPresent(System.out::println);
    }
    public static void main(String[] args) {
        threeDigit(ints);
    }
}
