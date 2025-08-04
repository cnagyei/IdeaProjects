/*
Calculations with two or three numbers from input

Write a program where you define two methods named 'calculate'. The first method takes two integer values as input,
multiplies them, and returns the result. The second method takes three integer values as input, adds the
first two numbers, multiples the result with the third number, and returns it. Your main program should call
these methods based on the number of inputs provided. You must read a string of integers from standard input.
The string will either have two or three integers separated by a space.
Depending on the number of numbers in the input, make a call to the appropriate method and print the output.

Sample Input 1:
2 3

Sample Output 1:
6

Sample Input 2:
3 4 5

Sample Output 2:
35
 */
import java.util.*;

public class OverloadingCalculate {
    // Method to read input from user and separate the integers
    public static void processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        // Call the appropriate function depending on the number of integers in the input
        if (intArr.length == 2) {
            // Call calculate(int, int)
            // TO DO: Fill in the appropriate code here
            System.out.println(calculate(intArr[0], intArr[1]));
        } else if (intArr.length == 3) {
            // Call calculate(int, int, int)
            // TO DO: Fill in the appropriate code here
            System.out.println(calculate(intArr[0], intArr[1], intArr[2]));
        }
    }

    public static void main(String[] args) {
        processInputAndCallFunctions();
    }

    public static int calculate(int a, int b) {
        return a * b;
    }

    public static int calculate(int a, int b, int c) {
        return (a + b) * c;
    }
}