import java.util.*;
public class Animals {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(String animal : args)
            list.add(animal);
        Iterator<String> iter = list.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
    }
}
