import java.util.Scanner;
import java.time.LocalDate;

class MainLocalDate2Weeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        LocalDate localDate = LocalDate.parse(input);
        LocalDate plus2Weeks = localDate.plusWeeks(2);

        System.out.println(plus2Weeks);
    }
}