import java.util.*;
public class ZooManager {
    public static void main(String[] args) {
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        Arrays.asList(1,2,3,4,5,6).parallelStream()
            .map(i -> {data.add(i); return i;})  // AVOID STATEFUL LAMBDA EXPRESSIONS
            .forEachOrdered(i -> System.out.print(i+" "));

        System.out.println();
        for(Integer e: data) {
            System.out.print(e+" ");
        }
    }
}
