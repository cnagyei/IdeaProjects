import java.util.Scanner;

public class LargestInSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int currentMax = 0;

        do {
            number = scanner.nextInt(); // Accept input
            currentMax = Math.max(number, currentMax); // Compare new entry with existing max
        } while (number != 0);

        System.out.println(currentMax);
    }
}