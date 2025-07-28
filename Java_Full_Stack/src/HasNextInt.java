import java.util.Scanner;

public class HasNextInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int sum = 0;

       while (scanner.hasNextInt()) {
           int elem = scanner.nextInt();
           sum += elem;
       }
       System.out.println(sum);
    }
}