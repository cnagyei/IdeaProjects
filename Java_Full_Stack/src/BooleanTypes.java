import java.util.Scanner;

public class BooleanTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSunny = scanner.nextBoolean();
        boolean isRainy = scanner.nextBoolean();
        boolean isCold = scanner.nextBoolean();

        // Calculate and print decision
        boolean decision = isSunny && (!isRainy || !isCold);
        System.out.println(decision);

        scanner.close();
    }
}
