import java.util.*;
public class Question {
    public static void main(String[] args) {
        //HashSet<Number> hs = new HashSet<Integer>();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        List<String> list = new Vector<String>();
        //List<Object> values = new HashSet<Object>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
    }
}
