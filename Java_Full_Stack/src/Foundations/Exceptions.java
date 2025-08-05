public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }
}