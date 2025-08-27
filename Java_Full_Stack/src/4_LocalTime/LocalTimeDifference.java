import java.time.LocalTime;
import java.util.Scanner;

class MainDifference {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        // Create time from input
        LocalTime time1 = LocalTime.parse(sc.nextLine());
        LocalTime time2 = LocalTime.parse(sc.nextLine());

        System.out.println(Math.abs(time2.toSecondOfDay() -  time1.toSecondOfDay()));
    }
}