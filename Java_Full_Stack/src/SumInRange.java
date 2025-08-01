/*
Sum of numbers in the range
Implement a method sumInRange for calculating the sum of numbers in the range
from (inclusive), to (exclusive). Mind the type of the return value.
 */
import java.util.Scanner;

public class SumInRange {

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        // write your code here
        long sum = 0;

        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}