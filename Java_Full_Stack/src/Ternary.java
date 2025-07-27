import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int num = scanner.nextInt();

        // Use a ternary operator to check if the integer is positive, negative or zero
        // and print the corresponding message
        String result = num > 0 ? "Positive": num == 0 ? "Zero" : "Negative";
        System.out.println(result);
    }
}