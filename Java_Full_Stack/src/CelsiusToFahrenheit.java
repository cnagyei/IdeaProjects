public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double celsius = scanner.nextDouble();

        while (celsius >= 0) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.1f°C = %.1f°F\n", celsius, fahrenheit);
            celsius = scanner.nextDouble();
        }
        scanner.close();
    }
}