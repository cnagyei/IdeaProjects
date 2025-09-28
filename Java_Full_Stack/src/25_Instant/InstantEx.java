import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Set;

public class InstantEx {
    public static void main(String[] args) {

        /* The date and time 1970-01-01T00:00:00Z (midnight, January 1, 1970, Coordinated Universal Time) is
        considered the epoch in Java because it's the standard reference point adopted by the Unix operating system.
         */
        Instant epoch = Instant.EPOCH;
        System.out.println(epoch); // 1970-01-01T00:00:00Z - Zulu Time, UTC which does not observe daylight saving

        System.out.println("=== Adding to Epoch ===");
        long posValue = 1234567890L;
        long negValue = -1234567890L;

        // Adding specific milliseconds to epoch
        Instant milli = Instant.ofEpochMilli(posValue); // mill 1/1000 second
        System.out.println(milli); // 1970-01-15T06:56:07.890Z

        // Adding specified seconds to epoch
        Instant seconds = Instant.ofEpochSecond(posValue);
        System.out.println(seconds); // 2009-02-13T23:31:30Z

        // Adding specified seconds and nanoseconds
        Instant secondNano = Instant.ofEpochSecond(posValue, 123L);
        System.out.println(secondNano);

        System.out.println("\n=== Subtracting from Epoch ===");
        milli = Instant.ofEpochMilli(negValue);
        System.out.println(milli);

        seconds = Instant.ofEpochSecond(negValue);
        System.out.println(seconds);

        secondNano = Instant.ofEpochSecond(negValue, 123L);
        System.out.println(secondNano);

        System.out.println("\n=== Zone ID ===");

        Instant instant = Instant.ofEpochSecond(1234567890L);
        System.out.println(instant);
        System.out.println(instant.atZone(ZoneId.of("GMT+4")));
        System.out.println(instant.atZone(ZoneId.of("UTC-5")));
        System.out.println(instant.atZone(ZoneId.of("Africa/Accra")));
        System.out.println(instant.atZone(ZoneId.of("America/Los_Angeles")));
        System.out.println(instant.atZone(ZoneId.systemDefault()));

        System.out.println(ZoneId.systemDefault().getId());
        System.out.println(ZoneId.systemDefault().getRules());

//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);

        Instant instant1 = Instant.parse("2009-02-13T23:31:30.000000123Z");
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1234567890L);
        System.out.println(instant2);

        System.out.println(instant1.isBefore(instant2));
        System.out.println(instant1.isAfter(instant2));
        System.out.println(instant1.equals(instant2));
        System.out.println(instant1.compareTo(instant2));

        Instant instant3 = Instant.ofEpochSecond(123456L);
        System.out.println(instant3);
        System.out.println(instant3.minus(Period.ofDays(1)));
        System.out.println(instant3.minus(Duration.ofDays(1)));
        System.out.println(instant3.minus(1, ChronoUnit.DAYS));
        System.out.println(instant3);

        //System.out.println(instant.minus(Period.of(123, 12, 3)));

        // Until
        Instant exampleInstant = Instant.ofEpochSecond(100200300L);
        System.out.println(exampleInstant);
        System.out.println(Instant.EPOCH.until(exampleInstant, ChronoUnit.DAYS));
        System.out.println(Instant.EPOCH.until(exampleInstant, ChronoUnit.HOURS));

        // get Methods
        Instant ofEpochSecond = Instant.ofEpochSecond(123456L, 7890L);
        System.out.println(ofEpochSecond);
        System.out.println(ofEpochSecond.getEpochSecond());
        System.out.println(ofEpochSecond.getNano());
        System.out.println(ofEpochSecond.getClass().getSimpleName());
        System.out.println(ofEpochSecond.get(ChronoField.MICRO_OF_SECOND));
        System.out.println(ofEpochSecond.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(ofEpochSecond.get(ChronoField.NANO_OF_SECOND));

        System.out.println(ofEpochSecond.getLong(ChronoField.MICRO_OF_SECOND));
        System.out.println(ofEpochSecond.getLong(ChronoField.NANO_OF_SECOND));
        System.out.println(ofEpochSecond.getLong(ChronoField.MILLI_OF_SECOND));
        System.out.println(ofEpochSecond.getLong(ChronoField.NANO_OF_SECOND));

        Instant instantNow = Instant.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(instantNow); // Zone independent
        System.out.println(dateTime); // Zone dependent
    }
}
