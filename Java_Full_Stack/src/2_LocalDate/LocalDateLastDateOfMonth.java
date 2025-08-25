/*
The last day of a month
We normally speak of a day by addressing a month, for example, August 30. Another way to indicate a day is to
give an order number to each day in a year. Then we could say, for example, "242nd day of the year".

Write a program that reads a year and the number of a day in this year, and checks if the day is the
last day of a month or not.

The program must output either "true" or "false".

Sample Input 1:
2017 31

Sample Output 1:
true
 */
import java.time.LocalDate;
import java.util.Scanner;

class MainLastDateOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int day = sc.nextInt();

        // Crate a date object
        LocalDate date = LocalDate.ofYearDay(year,day);

        // Check if the day is end of month
        System.out.println(date.getDayOfMonth() == date.lengthOfMonth());
    }
}