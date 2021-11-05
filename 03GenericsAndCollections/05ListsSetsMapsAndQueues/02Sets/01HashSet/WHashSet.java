import java.util.*;

public class WHashSet {
    public static void main(String[] args) {
        hadd();
        System.out.println();
        tadd();
        System.out.println();
        tNavigableSet();
    }

    public static void hadd() {
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        for (Integer integer: set) System.out.print(integer + ", ");
        System.out.println();
    }

    public static void tadd() {
        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        for (Integer integer: set) System.out.print(integer + ", ");
        System.out.println();
    }

    public static void tNavigableSet() {
        NavigableSet<Integer> set = new TreeSet<>();
        for(int i = 1; i <= 20; i++) set.add(i);
        System.out.println(set.lower(10));
        System.out.println(set.floor(10));
        System.out.println(set.ceiling(20));
        System.out.println(set.higher(20));
    }
}
