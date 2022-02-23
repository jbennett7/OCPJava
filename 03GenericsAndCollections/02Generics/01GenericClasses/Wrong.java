import java.util.*;
public class Wrong {
    static void printNames(List list) {
        for(int i=0; i < list.size(); i++) {
            // class cast exception here
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        List names =  new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);
    }
}
