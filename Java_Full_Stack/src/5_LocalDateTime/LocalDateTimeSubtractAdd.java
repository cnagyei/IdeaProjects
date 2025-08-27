/*
Subtracting hours and adding minutes
The problem statement
Write a program that subtracts N hours and adds M minutes to a date-time pair.

Input data format
The first line contains a date-time pair (year-month-dayThours:minutes). The second line contains two numbers
separated by a space: hours to subtract and minutes to add.

Output data format
A single line with a date-time pair (year-month-dayThours:minutes).
Sample Input 1:
2017-12-15T11:11
1 58

Sample Output 1:
2017-12-15T11:09

Sample Input 2:
2016-11-22T00:00
5000 300010

Sample Output 2:
2016-11-22T00:10
 */

import java.time.LocalDateTime;
import java.util.Scanner;

class MainSubtractAdd {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String inputDate = sc.nextLine();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        // Create datetime
        LocalDateTime dateTime = LocalDateTime.parse(inputDate).minusHours(hours).plusMinutes(minutes);
        System.out.println(dateTime);
    }
}