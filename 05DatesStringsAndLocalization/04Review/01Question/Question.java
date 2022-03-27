import java.util.*;
public class Question {
    public static void main(String[] args) {
        Locale l = new Locale("hi", "IN");
        System.out.println(l);
    }
    public static void expand() {
        String [] sl = {"hi", "en", "fr", "de"};
        ArrayList<Locale> locales = new ArrayList<>();
        for(String l : sl)
            locales.add(new Locale(l));
        for(Locale locale : locales)
            System.out.println(locale);
    }
}
