/*
Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞). Otherwise, print False (case sensitive).

Notes:

numbers denoted with a parenthesis () are exclusive;
numbers denoted with a square bracket [] are inclusive.
 */
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean condition1 = n > -15 && n <= 12;
        boolean condition2 = n > 14 && n < 17;
        boolean condition3 = n >= 19;

        if (condition1 || condition2 || condition3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}