import java.util.*;

public class BeforeGenerics {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);
    }
    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++){
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }
}
