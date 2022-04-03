import java.util.*;
import java.util.concurrent.*;
public class NoFly {
    public static void main(String[] args) {
        Map<String, Object> foodData = new HashMap<String, Object>();
        //Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
        foodData.put("penguin",1);
        foodData.put("flamingo",2);
        try {
            for(String key: foodData.keySet())
                System.out.println(foodData.remove(key));
        } catch(java.util.ConcurrentModificationException e) {
            System.out.println("FOO");
        }
    }
}
