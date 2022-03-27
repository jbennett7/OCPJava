import java.time.*;
public class Question {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        long epochSeconds = 0;
        Instant instant = Instant.now();
        instant = Instant.ofEpochSecond(epochSeconds);
        //Instant instant = date.toInstant(); //Does not compile
        //Instant instant = dateTime.toInstant(); //Does not compile
        //Instant instant = time.toInstant(); //Does not compile 
        instant = zonedDateTime.toInstant();
    }
}
