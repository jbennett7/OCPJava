import java.util.*;
public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Wildcard card = new Wildcard();
        //A will fail at card.showSize because ArrayDeque is not a List.
        //ArrayDeque<?> list = new ArrayDeque<String>();
        //B
        //ArrayList<? super Date> list = new ArrayList<Date>();
        //C Lose the ? in ArrayList<?>()
        //List<?> list = new ArrayList<?>();
        //D LinkedList cannot be converted to List
        //List<Exception> list = new LinkedList<java.io.IOException>();
        //E
        Vector<? extends Number> list = new Vector<Integer>();
        card.showSize(list);
    }
}
