import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class MainLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println(LocalDateTime.now());

        LocalDateTime fullDate = LocalDateTime.of(2020, 10, 10, 10, 10, 10, 5);
        System.out.println(fullDate);

        System.out.println("================");

        System.out.println(LocalDateTime.parse("2025-08-26T22:13:10.1930329"));

        // Using LocalDate and LocalTime to create an instance of LocalDateTime
        LocalDate date = LocalDate.parse("2025-08-25");
        LocalTime time = LocalTime.parse("03:13");
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        // Using atTime() and atDate()
        System.out.println(date.atTime(time));
        System.out.println(time.atDate(date));

        System.out.println("================");

        // Get years to minutes
        System.out.println("getYear() - " + dateTime.getYear());
        System.out.println("getDayOfYear() - " + dateTime.getDayOfYear());
        System.out.println("getMonth() - " + dateTime.getMonth());
        System.out.println("getDayOfMonth() - " + dateTime.getDayOfMonth());
        System.out.println("getMonthValue() - " + dateTime.getMonthValue());
        System.out.println("Hour - " + dateTime.getHour());
        System.out.println("Minute - " + dateTime.getMinute());
        System.out.println("Second - " + dateTime.getSecond());
        System.out.println("Nano - " + dateTime.getNano());

        System.out.println("================");

        // Get whole date or whole time
        System.out.println(dateTime.toLocalDate()); // Pulls date only
        System.out.println(dateTime.toLocalTime()); // Pulls time only

        System.out.println("================");
        System.out.println(dateTime.plusDays(12));
    }
}