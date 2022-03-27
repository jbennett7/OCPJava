import java.util.*;
public class Pick {
    public static void main(String[] args) {
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("hi", "IN"));

        Locale l1 = new Locale.Builder()
            .setLanguage("en")
            .setRegion("US")
            .build();
        Locale l2 = new Locale.Builder()
            .setRegion("US")
            .setLanguage("en")
            .build();
        System.out.println(l1);
        System.out.println(l2);
    }
}
