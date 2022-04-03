import java.util.*;
public class ZooManager {
    public static void main(String[] args) {
        Arrays.asList("jackal","kangaroo","lemur","lion","bear","possium")
            .parallelStream()
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
    }
}
