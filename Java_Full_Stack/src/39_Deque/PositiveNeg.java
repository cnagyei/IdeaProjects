import java.util.Scanner;

public class PositiveNeg {
        public static void main(String[] args) {
//            // Create a Scanner object
//            Scanner sc = new Scanner(System.in);
//
//            // Place your code here
//            double input = sc.nextDouble();
//
//            if (input != (int) input) {
//                System.out.println("non-integer");
//                return;
//            }
//            if (input < 0) {
//                System.out.println("negative");
//            }
//            else if (input > 0) {
//                System.out.println("positive");
//            }
//            else {
//                System.out.println("zero");
//            }
//
//                sc.close();

            method(0);
            method(1, 2, 3);
            method(new int[] {1, 2});
            method();
            method(null);
        }

        public static void method(int... varargs) {
            System.out.println(varargs.length);
        }
    }
