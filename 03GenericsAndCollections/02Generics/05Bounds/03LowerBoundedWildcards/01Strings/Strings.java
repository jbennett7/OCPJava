import java.util.*;
public class Strings {
    public static void addSound(List<? super String> list, String sound) {
        list.add(sound);
    }
    public static void main(String [] args){
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings, "quack");
        addSound(objects, "quack");
        for(String str: strings) System.out.println(str);
        for(Object obj: objects) System.out.println(obj);
    }
}
