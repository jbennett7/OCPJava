import java.util.*;
public class Count {
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }
    public static void main(String [] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(total(numbers));
    }
}
