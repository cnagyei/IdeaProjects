import java.time.LocalDate;

class MainLocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());

        System.out.println("=======================");

        System.out.println(LocalDate.ofYearDay(2025, 20));

        LocalDate date1 = LocalDate.of(2020, 11, 1);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2020-01-01");
        System.out.println(date2);

        System.out.println("=======================");
        System.out.println(date1.lengthOfMonth());
        System.out.println(date1.lengthOfYear());
        System.out.println(date1.plusDays(1));
        System.out.println(date1.plusMonths(1));
        System.out.println(date1.plusYears(1));
        System.out.println(date1.plusWeeks(1));
        System.out.println(date1.minusDays(1));
        System.out.println(date1.withYear(2026));
        System.out.println(date1.withMonth(2));
    }
}