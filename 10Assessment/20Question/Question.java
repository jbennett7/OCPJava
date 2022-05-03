import java.util.stream.*;
import java.util.function.*;
import java.time.*;
public class Question {
    public static void main(String[] args) {
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u = l -> l;
        s.filter(l -> l != null).map(u).peek(System.out::println);
    }
}
