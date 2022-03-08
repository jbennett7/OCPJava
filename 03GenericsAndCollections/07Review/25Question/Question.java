import java.util.*;
public class Question {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 4, (a,b) -> a + b);
        map.merge(3, 5, (a,b) -> a + b);
        System.out.println(map);
    }
}
