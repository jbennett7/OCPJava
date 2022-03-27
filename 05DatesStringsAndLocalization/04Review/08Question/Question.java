import java.time.*;
public class Question {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40); // Compiles but throws runtime exception.
        System.out.println(date.getYear() + " " + date.getMonth()
                + " " + date.getDayOfMonth());
    }
}
