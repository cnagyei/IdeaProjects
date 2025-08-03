/*
Checking divisibility and printing appropriate strings
Write a Java program that takes an integer as an input. If the number is divisible by 3, it should print 'Fizz',
and if it's divisible by 5, it should print 'Buzz'. If it's divisible by both 3 and 5, print 'FizzBuzz'.
For any other integer, just print 'None'. You need to create separate methods to check divisibility by 3, 5 and both.
 */
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        if ((num % 3 != 0) && (num % 5 != 0)) {
            System.out.print("None");
        } else if ((num % 3 == 0) && (num % 5 == 0)) {
            isDivByThreeAndFive(num);
        } else if (num % 5 == 0){
            isDivByFive(num);
        } else if (num % 3 == 0) {
            isDivByThree(num);
        }
    }

    // function isDivByThree will be here
    public static void isDivByThree(int num) {
        System.out.print("Fizz");
    }
        // function isDivByFive will be here
    public static void isDivByFive(int num1) {
        System.out.print("Buzz");
    }
        // function isDivByThreeAndFive will be here
    public static void isDivByThreeAndFive(int num) {
        System.out.print("FizzBuzz");
    }
}