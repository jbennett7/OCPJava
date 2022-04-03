import java.util.*;
public class ZooManager {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(); // need to use a concurrent colelction.
        Arrays.asList(1,2,3,4,5,6).parallelStream()
            .map(i -> {data.add(i); return i;})
            .forEachOrdered(i -> System.out.print(i+" "));

        System.out.println();
        for(Integer e: data) {
            System.out.print(e+" ");
        }
    }
}
