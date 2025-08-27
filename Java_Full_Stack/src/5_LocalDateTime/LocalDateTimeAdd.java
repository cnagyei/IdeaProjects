/*
Add 11 hours and print the date
 Report a typo
Write a program that reads date-time, adds 11 hours to it and then prints out the resulting date.

The input date-time format should be, for example, "2017-12-31T22:30". The resulting date then must be "2018-01-01".

Sample Input 1:

2017-12-31T22:30
Explain code
Sample Output 1:

2018-01-01
 */

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;

class MainAdd {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String inputDate = sc.nextLine();

        // Create date
        LocalDate dateTime = LocalDateTime
                .parse(inputDate)
                .plusHours(11)
                .toLocalDate();
        System.out.println(dateTime);
    }
}