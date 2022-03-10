import java.util.stream.*;
import java.util.function.*;
public class Question {
    public static void main(String[] args) {
        Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growl! ");
        Stream<String> stream2 = Stream.generate(() -> "growl! ");
        boolean b1 = stream1.anyMatch(predicate);
        //Hangs
        //boolean b2 = stream2.allMatch(predicate);
        //System.out.println(b1 + " " + b2);
    }
}
