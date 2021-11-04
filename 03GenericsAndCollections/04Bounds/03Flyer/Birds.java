import java.util.*;

public class Birds {
    public static void addSound(List< ? super String> list) { list.add("quack"); }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);
    }
}
