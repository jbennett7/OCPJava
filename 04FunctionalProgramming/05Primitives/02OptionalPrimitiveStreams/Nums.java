import java.util.stream.*;
import java.util.*;
public class Nums {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(() -> Double.NaN));
    }
}
