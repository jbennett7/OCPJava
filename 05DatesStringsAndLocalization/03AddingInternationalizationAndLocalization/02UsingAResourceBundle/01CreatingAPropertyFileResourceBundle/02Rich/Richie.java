import java.util.*;

public class Richie {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Richie");
        System.out.println(rb.getString("accountNumber"));
        System.out.print(rb.getString("accountDescription"));
        System.out.println();
        System.out.print(rb.getString("accountAmount"));
    }
}
