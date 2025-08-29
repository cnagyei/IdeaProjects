import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class DurationExx {
    public static void main(String[] args) {
        Duration duration = Duration.of(3, ChronoUnit.DAYS);
        System.out.println(duration);

        System.out.println(Duration.of(3, ChronoUnit.HOURS));
        System.out.println(Duration.of(75, ChronoUnit.MINUTES));
        System.out.println(Duration.of(3, ChronoUnit.SECONDS));
        System.out.println(Duration.of(3, ChronoUnit.NANOS));
        System.out.println(Duration.parse("PT72H").equals(Duration.of(3, ChronoUnit.DAYS)));

        LocalTime startTime = LocalTime.of(11, 45, 20);
        LocalTime endTime = LocalTime.of(12, 50, 30);

        System.out.println(Duration.between(startTime, endTime)); // Time duration between two times

        // Extracting - use get...()
        System.out.println("-------");
        System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());
        System.out.println(Duration.of(1, ChronoUnit.DAYS).get(ChronoUnit.SECONDS));

        System.out.println("-------");

        Duration duration1 = Duration.ofSeconds(4500, 567);
        System.out.println(duration1.getSeconds());
        System.out.println(duration1.getNano());

        System.out.println("-------");

        System.out.println(Duration.of(75, ChronoUnit.MINUTES).subtractFrom(LocalTime.of(20, 2, 22)));
        System.out.println(Duration.ZERO.plus(Duration.of(1, ChronoUnit.DAYS)));
    }
}