import java.util.*;

public class WMaps {
    public static void main(String[] args) {
        hHashMap();
        System.out.println();
        tTreeMap();
    }

    public static void hHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");
        System.out.println(food);
        for (String key: map.keySet()){
            System.out.println("<" + key + ": " + map.get(key) + ">");
        }
    }

    public static void tTreeMap() {
        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");
        System.out.println(food);
        for (String key: map.keySet()){
            System.out.println("<" + key + ": " + map.get(key) + ">");
        }
    }
}
