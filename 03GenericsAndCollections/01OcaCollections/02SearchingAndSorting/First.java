import java.util.*;
public class First {
    public static void main(String[] args) {
        int[] numbers = {6,9,1,8};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 3));
    }
}
