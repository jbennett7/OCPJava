import java.util.*;
public class Question {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(10);
        for (int i = 1; i <= 10; i++)
            map.put(i, i*i);
        System.out.println(map.get(4));
    }
}
