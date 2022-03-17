import java.text.ParseException;
import java.text.*;
import java.util.*;

public class ParseExcept {
    public static void main(String[] args) throws ParseException {
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        try {
            System.out.println(en.parse(args[0]));
        } catch(ParseException e) {
            e.printStackTrace();
        }
    }
}
