/*
Count how many times a number occurs
Write a program that reads an array of ints and an integer number n.
The program must check how many times n occurs in the array.
Input data format
The first line contains the size of the input array.
The second line contains elements of the array separated by spaces.
The third line contains n.
Output data format
The result is only a single non-negative integer number.
Sample Input 1:
6
1 2 3 4 2 1
2

Sample Output 1:
2

Sample Input 2:
9
1 2 3 4 5 4 3 2 1
7

Sample Output 2:
0
 */

import java.util.Scanner;

class ArrayIterating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size
        int arraySize = scanner.nextInt();

        // Declare and initialize array
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // Fill array
        }

        // Loop to check the occurrence of integer
        int number = scanner.nextInt();
        int countNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                countNumber++;
            }
        }
        System.out.println(countNumber);
    }
}