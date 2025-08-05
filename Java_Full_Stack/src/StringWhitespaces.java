/*
Comparing strings ignoring whitespaces
Write a program that reads two lines and compares them without whitespaces.
The program should print true if both lines are equal, otherwise – false.

Sample Input 1:
  string
str ing

Sample Output 1:
true

Sample Input 2:
string
my string

Sample Output 2:
false
 */
import java.util.Scanner;

class StringWhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String newStr1 = str1.trim().replace(" ", "");
        String newStr2 = str2.trim().replace(" ", "");

        System.out.println(newStr1.equals(newStr2));
    }
}