/*
Converting and printing double values as integers
Please write a Java program that reads in a number of type double and prints it to the console as an integer.
All values are guaranteed to be within the valid range of their data types.
 */
import java.util.Scanner;

public class TypeCastDoubleToInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double doubleNumber = scanner.nextDouble();
        int intNumber = (int) doubleNumber;

        System.out.println(intNumber);

        scanner.close();
    }
}