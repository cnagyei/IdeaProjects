import java.time.LocalTime;
import java.util.Scanner;

class MainLocalTimeWithoutSeconds {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // Create time
        LocalTime time = LocalTime.parse(input);
        System.out.println(time.withSecond(0));
    }
}