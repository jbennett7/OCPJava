import java.util.stream.*;
import java.util.function.*;
public class Question {
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
        boolean b1 = stream.noneMatch(predicate);
        //operating on the same stream
        boolean b2 = stream.anyMatch(predicate);
    }
}
