import java.util.*;
public class Zoo_en extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {
            { "hello", "Hello" },
            { "open", "The zoo is open" } };
    }
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "resourcebundles.Zoo", Locale.US);
        System.out.println(rb.getObject("hello"));
    }
}
