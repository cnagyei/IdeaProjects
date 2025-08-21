/*
Write a program that reads three positive integers a, b, n and outputs the count of numbers
divisible by n in the range from a to b (a < b) inclusively.
 */
import java.util.Scanner;

class CountDivisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        /* Long Method
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count += 1;
            }
        }
        */
        int count = (b / n) - ((a - 1) / n);
        System.out.println(count);
    }
}