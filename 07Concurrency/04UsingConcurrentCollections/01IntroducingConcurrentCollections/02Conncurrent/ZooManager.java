import java.util.*;
import java.util.concurrent.*;
public class ZooManager {
    private Map<String,Object> foodData = new ConcurrentHashMap<String,Object>();
    public void put(String key, String value) {
        foodData.put(key, value);
    }
    public Object get(String key) {
        return foodData.get(key);
    }
}
