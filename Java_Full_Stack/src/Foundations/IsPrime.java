/*
Numbers divisible by six

Find the sum of numbers divisible by 6 in the given sequence of natural numbers.

The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.

It is guaranteed that there is always a number divisible by 6 in the sequence.

 */
import java.util.Scanner;

class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");

        scanner.close();
    }
}