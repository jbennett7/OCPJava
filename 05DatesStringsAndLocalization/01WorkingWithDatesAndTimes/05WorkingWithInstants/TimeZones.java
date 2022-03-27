import java.time.*;
import java.time.temporal.*;
public class TimeZones {
    public static void main(String[] args) {
        printEpoch();
    }
    private static void printEpoch() {
        Instant now = Instant.now();
        long lnow = now.getEpochSecond();
        Instant instant = Instant.ofEpochSecond(lnow);
        System.out.println(instant);
        Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay);
        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour);
        //Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);
    }
    private static void zonedInstants() {
        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
        System.out.println(instant);
    }
    private static void instantIntervals() {
        Instant now = Instant.now();
        try {
            Thread.sleep(4020);
        } catch(InterruptedException e) {
            System.out.println("Caught");
        }
        Instant later = Instant.now();
        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());
    }
}
