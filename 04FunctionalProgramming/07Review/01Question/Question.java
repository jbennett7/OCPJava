import java.util.stream.*;
public class Question {
    public static void main(String[] args) {
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        //System.out.println(stream.limit(2).map(x -> x + "2"));
        stream.limit(2).map(x -> x + "2").forEach(System.out::print);
    }
}
