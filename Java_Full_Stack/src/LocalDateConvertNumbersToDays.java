/*
Convert numbers to days
Write a program that reads a year and three days of this year (by their numbers) from the standard input and
output all dates corresponding to these numbers in the same order.

Sample Input 1:
2017
315
5
42

Sample Output 1:
2017-11-11
2017-01-05
2017-02-11
 */

import java.time.*;
import java.util.Scanner;

class MainConvertNumbersToDays {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int year =  input.nextInt();
        int date1 = input.nextInt();
        int date2 = input.nextInt();
        int date3 = input.nextInt();

        // LocalDate.ofYearDay() takes only Year and the number of days in the year to crate a date
        System.out.println(LocalDate.ofYearDay(year,date1));
        System.out.println(LocalDate.ofYearDay(year,date2));
        System.out.println(LocalDate.ofYearDay(year,date3));
    }
}