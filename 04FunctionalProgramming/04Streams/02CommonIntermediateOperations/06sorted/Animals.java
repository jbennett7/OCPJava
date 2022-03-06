import java.util.stream.*;
public class Animals {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print);

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s.sorted(Comparator.reverseOrder())
            .forEach(System.out::print);
    }
}
