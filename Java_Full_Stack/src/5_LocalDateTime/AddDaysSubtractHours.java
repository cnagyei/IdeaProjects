import java.time.LocalDateTime;
import java.util.Scanner;

class AddDaysSubtractHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputDate = sc.next();
        int inputDays = sc.nextInt();
        int inputHours = sc.nextInt();

        LocalDateTime dateTime = LocalDateTime.parse(inputDate)
                .plusDays(inputDays)
                .minusHours(inputHours);
        System.out.println(dateTime);
    }
}