/*
Sum of multiples of 3 in an array
Write a program that accomplishes the following tasks: 1. Accepts an integer 'n' as input which indicates
the number of elements to be in the array. 2. Afterward, accepts 'n' number of integers as input for elements
of the array. 3. The program should then calculate the sum of all the elements in the array which are
multiples of 3. 4. Print the sum of these numbers as output.
*/
import java.util.Scanner;

public class ArraySumOfMultiplesOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create array
        int[] myArray = new int[number];

        // Fill array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }

        // Check for and sum multiples of 3
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 3 == 0) {
                sum += myArray[i];
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}