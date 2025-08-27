import java.time.LocalTime;
class LocalTimeDemo {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time = LocalTime.now();

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now());

        System.out.println(LocalTime.of(12, 45));
        System.out.println(LocalTime.of(11, 45, 30));
        System.out.println(LocalTime.parse("11:45:15"));

        System.out.println("========");
        // Use seconds and nano to create time
        System.out.println(LocalTime.ofSecondOfDay(86399));
        System.out.println(LocalTime.ofNanoOfDay(123_456_7890));

        System.out.println("========");

        // Predefined constants
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);

        System.out.println("========");

        LocalTime myTime = LocalTime.of(11, 45, 30);

        System.out.println(myTime.getHour());
        System.out.println(myTime.getMinute());
        System.out.println(myTime.getSecond());
        System.out.println(myTime.getNano());

        System.out.println(myTime.toSecondOfDay());

        System.out.println("========");

        // Arithmetic methods
        LocalTime time1 = LocalTime.of(11, 45, 30);

        System.out.println(time1.plusHours(1));
        System.out.println(time1.minusHours(1));
        System.out.println(time1.plusMinutes(1));
        System.out.println(time1.minusMinutes(1));
        System.out.println(time1.plusSeconds(1));
        System.out.println(time1.minusSeconds(1));
        System.out.println(time1.plusNanos(1));
        System.out.println(time1.minusNanos(1));

        System.out.println("========");

        // The following methods return a copy of an instance with one altered part
        System.out.println(time1);
        System.out.println(time1.withHour(9));
        System.out.println(time1.withMinute(48));
        System.out.println(time1.withSecond(07));
        System.out.println(time1.withNano(9048));
    }
}