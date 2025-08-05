/*
Calculating factorial of a given number
Create a Java program that prompts the user for an integer 'n' and prints the factorial of 'n'.
Your program should consist of a main method where all your logic resides.
Assume the input integer 'n' is non-negative. The main method should read from the standard input and
print to the standard output. For example, if the input is 5, the output should be 120 since 1*2*3*4*5 = 120.
 */
import java.util.Scanner; // 3.1 Import necessary library

public class Factorial2 { // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()
        int n = scanner.nextInt();

        // TODO: 2. Print the factorial of 'n'
        int result = 1, i;
        for (i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
        scanner.close(); // Always close the scanner when done
    }

}