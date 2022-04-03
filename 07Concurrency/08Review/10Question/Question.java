import java.util.*;
public class Question {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
                .parallelStream().parallel()
                .reduce(0,
                    (c1, c2) -> c1.length() + c2.length(),
                    (s1, s2) -> s1 + s2));
    }
}
