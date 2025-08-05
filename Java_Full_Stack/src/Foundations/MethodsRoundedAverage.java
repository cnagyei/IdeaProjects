/*
Product and rounded average of two integers
 Report a typo
You need to create a program that takes in two integers as input. You ought to define two separate
methods – one method to find the product of the two integers and another to find the average and round it down
to the nearest whole number. The first input will represent the first integer, while the second input will be
the second integer. You must print the product and average as output.
 */
import java.util.Scanner;

public class MethodsRoundedAverage {
    // Method 1: This method will compute the product of two numbers.
    static int product(int num1, int num2) {
        // Write your code here.
        return num1 * num2;
    }

    // Method 2: This method will compute the average of two numbers
    // and round it down to the nearest whole number.
    static int average(int num1, int num2) {
        // Write your code here.
        return (num1 + num2) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Call the methods here and print the result.
        int product = product(num1, num2);
        int average = average(num1, num2);

        System.out.println(product);
        System.out.println(average);
    }
}