import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
class MainPassedHours {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String inputDate = sc.nextLine();

        // Create dateTime
        LocalDateTime dateTime = LocalDateTime.parse(inputDate);
        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();
        int dayOfYear =  date.getDayOfYear() - 1;
        int hourOfLastDay = time.getHour();
        int totalHours = (dayOfYear * 24) + hourOfLastDay;
        System.out.println(totalHours);
    }
}