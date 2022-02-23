import java.util.*;
public class Scores {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
    public static void main(String[] args) {
        System.out.println(average());
        System.out.println(average(90, 100));

        Optional<Double> opt = average(91, 100);
        if (opt.isPresent())
            System.out.println(opt.get());

        Optional<Double> opt2 = average();
        //System.out.println(opt2.get()); // bad, need to check first as above.

        Optional o = (opt2== null) ? Optional.empty(): Optional.of(opt2);
        System.out.println(o);

        Optional o2 = Optional.ofNullable(opt2);
        System.out.println(o2);
    }
}
