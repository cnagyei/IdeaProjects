import java.security.cert.TrustAnchor;
import java.util.Arrays;

class TryCatch {
    public static void main(String[] args) {

        System.out.println("Before try-catch block");

        try {
            System.out.println("Inside try block before exception");
            System.out.println(2 / 0);
            System.out.println("Inside try block after exception");
        } catch (Exception e) {
            System.out.println("Division by Zero!");
        }

        System.out.println("After try-catch block");

        System.out.println("===========");

        try {
            double d = 2 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println(e.getClass().getSimpleName());
        }

        System.out.println("===========");

        // Handling several exceptions and multi-catch and finally
        String[] str = {"2", "hello"};
        try {
           int n = 4 / 0;
            System.out.println(str[4]);
            System.out.println(str);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Looks like Exceptions is quite a gray area");
        }

        System.out.println("===========");

        try {
            Integer.parseInt("123abc"); // Exception not handled by a catch block
        } finally { // still executes
            System.out.println("Checking try-finally");
            System.out.println("Continue to execute");
        }

        // Code breaks
        System.out.println("Continue to execute");
    }
}