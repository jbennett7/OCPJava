import java.time.*;
public class DDates {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        System.out.println();
        Month month = Month.JANUARY;
        System.out.println(month==Month.MARCH);
        System.out.println(LocalTime.of(6, 15));
        System.out.println(LocalTime.of(6, 15, 30));
        System.out.println(LocalTime.of(6, 15, 30, 200));

        System.out.println();
        System.out.println(LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30));
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(6, 15);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
    }
}
