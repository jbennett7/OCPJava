import java.util.stream.*;
public class Animals {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print);
    }
}
