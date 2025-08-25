import java.util.Scanner;
import java.time.LocalDate;

class MainLocalDate30Years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dateInput = sc.nextLine();

        LocalDate date = LocalDate.parse(dateInput);
        System.out.println(date.minusYears(30));
        System.out.println(date.plusYears(30));
    }
}