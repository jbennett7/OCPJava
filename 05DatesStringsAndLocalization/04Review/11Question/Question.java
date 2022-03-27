import java.time.*;
import java.time.format.*;
public class Question {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
    }
}
