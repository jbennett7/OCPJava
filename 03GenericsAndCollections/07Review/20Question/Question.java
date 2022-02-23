import java.util.*;
public class Question {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        //Map does not contain a method 'contains'
        //System.out.println(m.contains("123"));
        System.out.println(m.containsKey("123"));
        System.out.println(m.containsValue("123"));
    }
}
