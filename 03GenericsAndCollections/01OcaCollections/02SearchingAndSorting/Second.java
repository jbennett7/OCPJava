import java.util.*;
public class Second {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,7,5,3);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,3));
        System.out.println(Collections.binarySearch(list,2));
    }
}
