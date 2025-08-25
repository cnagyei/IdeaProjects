/*
Find all mondays
Write a program that reads a year and the number of a month (1-12) and prints the dates of all Mondays of this
month in the correct order (from the first to the last).
Sample Input 1:
2017 1

Sample Output 1:
2017-01-02
2017-01-09
2017-01-16
2017-01-23
2017-01-30
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class MainFindMondays {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int inputYear = sc.nextInt();
        int inputMonth = sc.nextInt();

        // Create date object
        LocalDate date = LocalDate.of(inputYear, inputMonth, 1);

        // Get number of days in month
        int monthLength = date.lengthOfMonth();

        while (date.getDayOfMonth() != monthLength) {

            // Check if the current day is Monday and print it
            if(date.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                System.out.println(date);
            }

            // Calculate the next date
            LocalDate nextDate = date.plusDays(1);

            // Break loop if next date falls into the next month
            if (nextDate.getDayOfMonth() > monthLength) {
                break;
            }

            // Set date to nextDate for the next iteration
            date = nextDate;
        }
    }
}