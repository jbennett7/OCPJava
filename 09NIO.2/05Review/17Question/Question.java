import java.nio.file.*;
import java.util.stream.*;
public class Question {
    public static void main(String[] args) {
        try {
            Files.walk(Paths.get("..").toRealPath().getParent())
                    .map(p -> p.toAbsolutePath().toString())
                    .filter(s -> s.endsWith(".java"))
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch(java.io.IOException e) {
            System.out.println(e);
        }
    }
}
