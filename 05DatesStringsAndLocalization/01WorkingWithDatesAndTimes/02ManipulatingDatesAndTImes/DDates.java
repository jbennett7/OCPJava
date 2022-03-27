import java.time.*;
public class DDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        System.out.println();
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);

        System.out.println();
        LocalDateTime dateTime2 = LocalDateTime.of(date, time);
        System.out.println(dateTime2);
        dateTime2 = dateTime2
            .minusDays(5)
            .minusHours(10)
            .minusSeconds(30);
        System.out.println(dateTime2);
    }
}
