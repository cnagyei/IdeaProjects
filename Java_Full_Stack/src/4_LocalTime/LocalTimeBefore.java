import java.time.LocalTime;
import java.util.Scanner;

class MainBefore {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        // Create time
        LocalTime time = LocalTime.parse(input).minusHours(hour).minusMinutes(minute);
        System.out.println(time);
    }
}