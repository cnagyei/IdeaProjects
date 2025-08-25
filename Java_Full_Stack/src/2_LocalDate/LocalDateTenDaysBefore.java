import java.util.Scanner;
import java.time.*;

class MainTenDaysBefore {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String inputDate = sc.nextLine();

        System.out.println(LocalDate.parse(inputDate).minusDays(10));
    }
}