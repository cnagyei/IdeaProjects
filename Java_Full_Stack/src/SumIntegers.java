import java.util.Scanner;

class SumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a ; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}