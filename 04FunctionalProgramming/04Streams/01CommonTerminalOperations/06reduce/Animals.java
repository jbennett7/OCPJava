import java.util.stream.*;
import java.util.function.*;
public class Animals {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word);

        Stream<Integer> intStream = Stream.of(3, 5, 6);
        Integer mult = intStream.reduce(1, (s, c) -> s * c);
        System.out.println(mult);

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println);
        oneElement.reduce(op).ifPresent(System.out::println);
        threeElements.reduce(op).ifPresent(System.out::println);
    }
}
