import java.time.*;
import java.util.Scanner;

class MainEndOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int daysRemaining  = sc.nextInt();

        // Create the first day of the date
        LocalDate date = LocalDate.of(year,month,1);
        int actualDaysCovered = date.lengthOfMonth() - daysRemaining;

        System.out.println(date.plusDays(actualDaysCovered));
    }
}