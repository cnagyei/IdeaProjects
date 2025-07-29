/*
Printing even numbers with a skip condition
Write a program in Java that asks the user for a single input, an integer 'n'.
Your task is to print all even integers up to 'n'. However, if the integer 10
is encountered while printing, your program should skip the number 10 and the five
numbers that follow it. Then, continue printing the remaining even numbers until 'n'.
 */
import java.util.Scanner;

public class EvenNumberSkipCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the integer 'n' as input from user
        int n = sc.nextInt();
        boolean isFirstNumber = true;

        // Loop from 1 to 'n' to print the numbers
        for(int i = 1; i <= n; i++) {
            // Include condition to check if 'i' is even
            if (i % 2 != 0) {
                continue;
            }
            // If 'i' is 10, skip this number and the next five numbers
            if (i >= 10 && i <= (10 + 5)) {
                continue;
            }
            if (!isFirstNumber) {
                System.out.print(" ");
            }

            // Print the number itself
            System.out.print(i);

            // After printing the first number, set the flag to false
            // so subsequent numbers will have a leading space
            isFirstNumber = false;
        }

        sc.close();
    }
}