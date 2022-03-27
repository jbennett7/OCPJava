package resourcebundles;
import java.util.*;
public class Tax_en_US extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {{ "tax", new UsTaxCode() }};
    }
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "resourcebundles.Tax", Locale.US);
        System.out.println(rb.getObject());
    }
}
