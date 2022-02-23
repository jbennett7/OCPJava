import java.util.*;

public class Summary {
    public static void main(String[] args) {
        ArrayListToarray();
        System.out.println();
        arrayToArrayList();
        System.out.println();
        searchAndSort();
        System.out.println();
        listSearchAndSort();
        System.out.println();
        Autoboxing();
    }

    private static void ArrayListToarray() {
        List<String> list = new ArrayList<>();
        list.add("Fluffy");
        list.add("Webby");

        String[] array = new String[list.size()];
        array[0] = list.get(1);
        array[1] = list.get(0);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "-");
    }

    private static void arrayToArrayList() {
        String[] array = {"gerbil", "mouse"};
        List<String> list = Arrays.asList(array);
        list.set(1, "test");
        array[0] = "new";
        String[] array2 = (String[]) list.toArray();
        try {
            list.remove(1);
        } catch(UnsupportedOperationException e) {
            System.out.println(e + ": list is not resizable because" +
                " it is backed by the underlying array.");
        }
    }

    private static void searchAndSort() {
        int[] numbers = {6, 9, 1, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 3));
    }

    private static void listSearchAndSort() {
        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, 3));
        System.out.println(Collections.binarySearch(list, 2));
    }

    private static void Autoboxing() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);
    }
}
