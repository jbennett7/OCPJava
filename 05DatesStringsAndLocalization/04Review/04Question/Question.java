import java.util.*;
public class Question {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Dolphins");
        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("age"));
//      System.out.println(rb.getString("Ocean"));
//      System.out.println(rb.getString("Seafarer"));
    }
}
