import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Question {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.dir") + "/signed-words.txt");
        Files.find(path.getParent(), 10.0, //k1
            (Path p) -> p.toString().endsWith(".txt") && Files.isDirectory(p)) // k2
            .collect(Collectors.toList())
            .forEach(System.out::println);

        Files.readAllLines(path) // k3
            .flatMap(p -> Stream.of(p.split(" "))) // k4
            .map(s -> s.toLowerCase()) // k5
            .forEach(System.out::println);
    }
}
