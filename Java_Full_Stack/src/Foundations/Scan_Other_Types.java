import java.util.Scanner;

public class Scan_Other_Types {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Capture all tokens on one line
        int number = sc.nextInt();
        double amount = sc.nextDouble();
        float price = sc.nextFloat();
        boolean valid = sc.nextBoolean();

        // Print output
        System.out.println("Integer: " + number);
        System.out.println("Double: " + amount);
        System.out.println("Float: " + price);
        System.out.println("Boolean: " + valid);

        sc.close();
    }
}