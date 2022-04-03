import java.util.concurrent.*;
import java.util.*;
public class ZooManager {
    public static void main(String[] args) {
        Map<String,Integer> map = new ConcurrentHashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        map.put("zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));
    }
}
