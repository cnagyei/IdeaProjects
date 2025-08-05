/*
Squaring up to the next perfect number
Create a Java program that finds and prints the first perfect square number greater
than a given input number. A perfect square is an integer that is the square of another integer.
Take an integer N as input (1 <= N <= 10000) and use a loop to check numbers starting from N+1.
Use the break statement to exit the loop when the first perfect square is found.
Print the perfect square number. Input: An integer N Output: The first perfect square
number greater than N
 */
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int perfectSquare = 0;
        // Your code to find the first perfect square greater than N goes here
        // Use a loop and the break statement when you find the answer
        for (int i = 1; i <= 10000; i++) {
            perfectSquare = i * i;
            if (perfectSquare > N) {
                break;
            }
        }

        // Print the result here
        System.out.println(perfectSquare);
    }
}