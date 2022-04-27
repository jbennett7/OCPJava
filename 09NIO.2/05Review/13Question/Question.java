import java.nio.file.*;
import java.util.stream.*;
public class Question {
    public static void main(String[] args) {
       Path path = Paths.get("/home/jbennett/Work/OCPJava");
       try {
           Files.find(path, 0, (p,a) -> a.isSymbolicLink())
               .map(p -> p.toString())
               .collect(Collectors.toList())
               .stream()
               .filter(x -> x.toString().endsWith(".java"))
               .forEach(System.out::println);
       } catch(java.io.IOException e) {
           System.out.println(e);
       }
    }
}
