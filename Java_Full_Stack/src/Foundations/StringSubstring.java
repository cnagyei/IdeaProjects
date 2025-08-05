/*
Extracting a substring

Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.

Sample Input 1:
Java
0 2

Sample Output 1:
Jav
 */
import java.util.Scanner;

class StringSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(subString(str, from, to));

    }

    static String subString(String str, int from, int to) {
        String newString = "";
        for (int i = from; i <= to; i++) {
            newString += str.charAt(i);
        }
        return newString;
    }
}