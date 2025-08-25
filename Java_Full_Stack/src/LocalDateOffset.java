import java.time.Month;
import java.util.Scanner;
import java.time.LocalDate;

class MainLocalDateOffset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dateInput = sc.nextLine();
        int offset = sc.nextInt();

        // Calculate date with offset
        LocalDate date = LocalDate.parse(dateInput);

        while(!date.isAfter(getYearEnd(date))) {

            // Print current date
            System.out.println(date);

            // Calculate next date
            LocalDate nextDate = date.plusDays(offset);

            // Check if next date is in same year
            if (nextDate.getYear() != date.getYear()) {
                break; // Exit loop is next date is in next year
            }
            // Update date for next iteration
            date = nextDate;
        }
    }

    public static LocalDate getYearEnd(LocalDate date) {
        int year = date.getYear();
        return LocalDate.of(year, Month.DECEMBER, 31);
    }
}