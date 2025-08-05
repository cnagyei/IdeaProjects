/*
Rounding down a halved float value to an integer
Write a Java program that accepts a float value as input. Your task is to divide this float value by 2.
The program should then print the output as an integer value after rounding the result down. For example,
if the input is 5.3, the program should print 2, not 3.
 */
import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float floatNumber = scanner.nextFloat();
        int intNumber = (int) floatNumber / 2;

        System.out.println(intNumber);

        scanner.close();
    }
}