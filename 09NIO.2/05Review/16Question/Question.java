import java.nio.file.*;
import java.util.stream.*;
public class Question {
    public static void main(String[] args) {
        Path path = Paths.get("food-schedule.csv");
        try {
            Files.lines(path)
                .flatMap(p -> Stream.of(p.split(",")))
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
        } catch(java.io.IOException e) {
            System.out.println(e);
        }
    }
}
