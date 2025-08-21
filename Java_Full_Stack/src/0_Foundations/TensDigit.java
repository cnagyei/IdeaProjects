import java.util.Scanner;

class TensDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int remainderOf100 = n % 100;
        int divideBy10 = remainderOf100 / 10;
        System.out.println(divideBy10);
    }
}
