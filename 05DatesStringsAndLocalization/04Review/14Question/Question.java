import java.time.*;
public class Question {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("US/Eastern");
        //LocalDate date = LocalDate.of(2016, 3, 13); //Works
        //LocalDate date = LocalDate.of(2016, 3, 40); //Runtime error
        //LocalDate date = LocalDate.of(2016, 11, 6); //Works
        LocalDate date = LocalDate.of(2016, 11, 7); //Works
        //LocalDate date = LocalDate.of(2017, 2, 29); //Runtime error
        LocalTime time1 = LocalTime.of(2, 15);
        ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
        System.out.println(a);
    }
}
