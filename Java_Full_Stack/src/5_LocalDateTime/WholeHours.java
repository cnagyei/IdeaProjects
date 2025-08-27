import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
The passed hours since the beginning of year

The problem statement
Write a program that reads a date-time pair and calculates how many hours have passed since the beginning of the year (1st January, 00:00).

Input data format
The first line contains a date-time pair in the format year-month-dayThour:minute:second.

Output data format
The line containing an integer number.
 */
class WholeHours {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String inputDate1 = sc.nextLine();
        String inputDate2 = sc.nextLine();

        // Create dateTime
        LocalDateTime dateTime1 = LocalDateTime.parse(inputDate1);
        LocalDateTime dateTime2 = LocalDateTime.parse(inputDate2);

        // Calculate hour difference using until()
        System.out.println(dateTime1.until(dateTime2, ChronoUnit.HOURS));

        // Can use time.Duration
        // Duration duration = Duration.between(dateTime1, dateTime2);
        // System.out.println(duration.toHours());
    }
}