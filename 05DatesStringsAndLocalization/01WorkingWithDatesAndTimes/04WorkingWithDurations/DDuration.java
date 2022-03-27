import java.time.*;
import java.time.temporal.*;
public class DDuration {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);
        Duration ddaily = Duration.of(1, ChronoUnit.DAYS);
        Duration hourly = Duration.ofHours(1);
        Duration hhourly = Duration.of(1, ChronoUnit.HOURS);
        Duration everyMinute = Duration.ofMinutes(1);
        Duration eeveryMinute = Duration.of(1, ChronoUnit.MINUTES);
        Duration everyTenSeconds = Duration.ofSeconds(10);
        Duration eeveryTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        Duration everyMilli = Duration.ofMillis(1);
        Duration eeveryMilli = Duration.of(1, ChronoUnit.MILLIS);
        Duration everyNano = Duration.ofNanos(1);
        Duration eeveryNano = Duration.of(1, ChronoUnit.NANOS);
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration));
        System.out.println(time.plus(duration));
        //System.out.println(date.plus(duration));
        System.out.println();
        Duration duration2 = Duration.ofHours(23);
        System.out.println(dateTime.plus(duration2));
        System.out.println(time.plus(duration2));
        //System.out.println(date.plus(duration2));
    }
}
