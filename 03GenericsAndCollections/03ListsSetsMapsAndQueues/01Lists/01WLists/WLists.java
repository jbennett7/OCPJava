import java.util.*;

public class WLists {
    public static void main(String [] args) {
        adds();
        System.out.println();
        removes();
        System.out.println();
        emptyAndSize();
        System.out.println();
        clears();
        System.out.println();
        containss();
    }

    public static void containss() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("robin"));
    }

    public static void clears() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.clear();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
    }

    public static void emptyAndSize() {
        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
    }

    public static void removes() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds);
        System.out.println(birds.remove(0));
        System.out.println(birds);
    }

    public static void adds() {
        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));
    }
}
