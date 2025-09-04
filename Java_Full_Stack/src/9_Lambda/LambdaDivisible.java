/*
Lambda check for divisibility by 3 and 5

Hey there! This problem might be a bit unpredictable, but give it a go and let us know how you do!
Write a lambda expression that takes an integer n as input and returns true if n is divisible by both 3 and 5,
and false otherwise. Scan the input integer n from the console and print the result of applying the
lambda expression to n.
Sample Input 1:
15

Sample Output 1:
true

Sample Input 2:
9

Sample Output 2:
false
 */
import java.util.Scanner;
import java.util.function.BooleanSupplier;

class MainDivisble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // TODO: Write a lambda expression that checks if n is divisible by both 3 and 5
        BooleanSupplier isDivisbleBy3And5 = () -> (n % 3 == 0) && (n % 5 == 0);

        System.out.println(isDivisbleBy3And5.getAsBoolean());
    }
}