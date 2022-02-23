import java.util.*;
public class First {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        // removes the first element.
        numbers.remove(1);
        // removes the Integer(5) element.
        numbers.remove(new Integer(5)); 
        System.out.println(numbers);
        int num = numbers.get(0);
        System.out.println(num);
    }
}
