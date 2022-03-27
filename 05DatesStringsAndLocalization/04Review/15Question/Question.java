import java.time.*;
import java.time.temporal.*;
public class Question {
    public static void main(String[] args) {
        String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
        String m2 = Duration.ofMinutes(1).toString();
        String s = Duration.of(60, ChronoUnit.SECONDS).toString();
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();

        System.out.println("m1==m2:\t\t" + (m1==m2));
        System.out.println("m1.equals(m2):\t" + m1.equals(m2)); // B
        System.out.println("m1.equals(s):\t" + m1.equals(s)); // C
        System.out.println("d==p:\t\t" + (d==p));
        System.out.println("d.equals(p):\t" + d.equals(p));
    }
}
