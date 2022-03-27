import java.time.*;
import java.time.format.*;
public class Question {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse(
                "2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE); // Does not compile
        date.plusDays(2); // Has no effect
        date.plusHours(3); // Has no effect
        System.out.println(date.getYear() + " "
                + date.getMonth() + " " + date.getDayOfMonth());
    }
}
