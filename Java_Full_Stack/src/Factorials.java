/*
Calculating factorials
Write a method that calculates the factorial of a given number.
The factorial of n is calculated by the product of integer number from 1 to n (inclusive).
The factorial of 0 is equal to 1.
 */
import java.util.Scanner;

public class Factorials {

    public static long factorial(long n) {
        long result = 1;

        // write your code here
        if (n < 0) {
            System.exit(0);
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}