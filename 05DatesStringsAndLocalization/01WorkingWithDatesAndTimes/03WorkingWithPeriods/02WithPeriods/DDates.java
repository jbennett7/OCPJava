import java.time.*;
public class DDates {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);
        System.out.println();
        System.out.println(Period.ofMonths(3));
        System.out.println(Period.of(1,2,3));
        System.out.println(Period.of(0,20,47));
        System.out.println(Period.ofWeeks(3));
        System.out.println(Period.ofWeeks(7));
        System.out.println();
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        //System.out.println(time.plus(period));
    }
    private static void performAnimalEnrichment(LocalDate start,
            LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
