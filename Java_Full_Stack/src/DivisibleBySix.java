/*
Numbers divisible by six

Find the sum of numbers divisible by 6 in the given sequence of natural numbers.

The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.

It is guaranteed that there is always a number divisible by 6 in the sequence.

 */
import java.util.Scanner;

class DivisibleBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = scanner.nextInt(); // Enter count of numbers
        int sum = 0;

        for (int i = 1; i <= numberCount; i++) {
            int number = scanner.nextInt(); // Accept multiple entries based on count
            sum += number % 6 == 0 ? number : 0; // Check if divisible by 6 and sum
        }
        System.out.println(sum);

        scanner.close();
    }
}