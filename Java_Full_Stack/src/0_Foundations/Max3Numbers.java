/*
Find the max of three numbers
Here is the method named getNumberOfMaxParam that takes three integer numbers and
returns the position of the first maximum in the order of the method parameters.
The method should return number 1, 2 or 3 respectively.
 */
import java.util.Scanner;

public class Max3Numbers {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        if (a == b && a == c) {
            return 1;
        } else if (a == b && a > c) {
            return 1;
        } else if (a == c && a > b) {
            return 1;
        } else if (b == c && b > a) {
            return 2;
        } else if (a > b && a > c) {
            return 1;
        } else if (b > a &&  b > c) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
