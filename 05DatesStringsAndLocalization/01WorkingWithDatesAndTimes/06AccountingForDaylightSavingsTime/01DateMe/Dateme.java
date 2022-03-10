import java.time.*;
public class Dateme {
    public static void main(String[] args) {
        // Fall Back
        LocalDate date = LocalDate.of(2016, Month.NOVEMBER,6);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println("Fall back in November");
        System.out.println(dateTime);
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);

        // Spring ahead
        System.out.println("\nSpring ahead in March");
        date = LocalDate.of(2016, Month.MARCH, 13);
        time = LocalTime.of(2, 30);
        zone = ZoneId.of("US/Eastern");
        dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime);
    }
}
