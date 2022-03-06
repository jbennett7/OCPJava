import java.util.function.*;
import java.util.stream.*;
public class Animals {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "goarilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print);
    }
}
