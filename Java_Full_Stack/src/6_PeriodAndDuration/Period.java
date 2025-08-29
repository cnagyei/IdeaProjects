import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class PeriodExx {
    public static void main(String[] args) {
        Period period = Period.of(1995, 5, 23);
        System.out.println(period);

        LocalDate startDate = LocalDate.of(1995, 5, 23);
        LocalDate endDate = LocalDate.of(1995, 8, 25);
        Period difference = Period.between(startDate, endDate);
        System.out.println(difference); // It will show negative values if the second argument is smaller, zero if they are equal, and a positive value if the second argument is larger.

        // Parse a text
        System.out.println(Period.parse("P23D"));
        System.out.println(Period.parse("P-1995Y5M2D"));
        System.out.println(Period.parse("-P1995Y5M23D"));

        // Extract Period units
        Period period2 = Period.parse("-P-1995Y5M23D");
        System.out.println(period2.getYears());
        System.out.println(period2.getMonths());
        System.out.println(period2.getDays());

        System.out.println("====Extract using the get() method====");
        // Extract using the get() method
        System.out.println(period2.get(ChronoUnit.YEARS));
        System.out.println(period2.get(ChronoUnit.MONTHS));
        System.out.println(period2.get(ChronoUnit.DAYS));

        System.out.println("====Operating with Period Units====");
        // Operating with Period units

        // addTo() and subtractFrom() used to operate on Temporal variable which is a base interface of several
        // classes including LocalDate, LocalDateTime, ZonedDateTime, and so on - Returns LocalDate
        Period myPeriod = Period.of(1, 1, 1);
        System.out.println("addTo(): " + myPeriod.addTo(LocalDate.of(1995, 5, 2)));
        System.out.println("subtractFrom(): " + myPeriod.subtractFrom(LocalDate.of(1995, 5, 23)));
        System.out.println(myPeriod);

        System.out.println("-------");
        // plus() and minus() operates on Period type variables - Returns Period
        Period period3 = Period.of(1, 1, 1);
        System.out.println(period3.plus(Period.of(1995, 4, 23)));
        System.out.println(period3.minus(Period.of(1995, 4, 23)));
        System.out.println(period3);


    }
}