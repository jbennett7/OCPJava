import java.util.*;
public class ZooManager {
    public static void main(String[] args) {
        System.out.print(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());

        System.out.println();

        System.out.print(Arrays.asList(1,2,3,4,5,6).parallelStream().findAny().get());
    }
}
