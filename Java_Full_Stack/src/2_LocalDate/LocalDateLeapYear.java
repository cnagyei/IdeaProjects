/*
Leap Year Check: A Date's True Colors

Hey there! This problem might be a bit unpredictable, but give it a go and let us know how you do!
Write a Java program that accepts a date in 'YYYY-MM-DD' format and prints 'true' if the year of the
registered date is a leap year, otherwise 'false'.

Sample Input 1:
2020-06-15

Sample Output 1:
true

Sample Input 2:
2019-03-01

Sample Output 2:
false
 */
import java.time.LocalDate;
import java.util.Scanner;

class MainLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        System.out.println(date.isLeapYear());
    }
}