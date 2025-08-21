/*
Find the next Unicode character
        Report a typo
        Write a program in Java that receives a character from the input and returns the next character
        in the Unicode table. Your program should read a single character from the input and print a
        single character as output.

        Sample Input 1:
        a

        Sample Output 1:
        b

        Sample Input 2:
        A

        Sample Output 2:
        B
*/
import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        // Create a new scanner object for user input
        Scanner input = new Scanner(System.in);

        // Waiting for user input
        char inputChar = input.next().charAt(0);

        // Perform operation on character here and print the result
        inputChar++;
        System.out.println(inputChar);
    }
}