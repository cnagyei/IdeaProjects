import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.util.Scanner;
import java.time.Instant;

class MainInstant {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(dateInEpochSecond(scanner.nextLine()));

        Instant instant = Instant.EPOCH;
        instant.minus(Period.ofDays(1));
        System.out.println(instant.minus(Duration.ofDays(1)).atZone(ZoneId.of("GMT+6")));


    }

    public static long dateInEpochSecond(String text) {
        return Instant.parse(text).getEpochSecond();
    }
}