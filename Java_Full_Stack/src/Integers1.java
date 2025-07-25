import java.util.Scanner;
import java.lang.Math;

public class Integers1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long bigNumber = 100_000_000_000L; // End number with 'L' or 'l' otherwise it is int

        int a = sc.nextInt();
        int b = sc.nextInt();
        long c = sc.nextLong();
        long d = sc.nextLong();

        int intResult = a + b;
        long longResult = c + d;

        System.out.println("Print integer: " + intResult);
        System.out.println("Print long: " + longResult);
    }
}
