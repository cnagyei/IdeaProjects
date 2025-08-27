/*
Merging date-time instances

Implement a method that takes two instances of LocalDateTime class and merges them into one object by
choosing the largest value of each component for the target object. Consider the following
components: years, months, days of months, hours, minutes and seconds.

Output the resulting LocalDateTime object.

Sample Input 1:
2018-10-20T22:30
2017-12-30T22:31:45

Sample Output 1:
2018-12-30T22:31:45
 */
import java.time.LocalDateTime;
import java.util.Scanner;

class MainLocalDateTimeMerge {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // write your code here
        int highestYear = Math.max(dateTime1.getYear(), dateTime2.getYear());
        int highestMonth = Math.max(dateTime1.getMonthValue(), dateTime2.getMonthValue());
        int highestDay = Math.max(dateTime1.getDayOfMonth(), dateTime2.getDayOfMonth());
        int highestHour = Math.max(dateTime1.getHour(), dateTime2.getHour());
        int highestMinute = Math.max(dateTime1.getMinute(), dateTime2.getMinute());
        int highestSecond = Math.max(dateTime1.getSecond(), dateTime2.getSecond());

//        System.out.println("highestYear: " + highestYear);
//        System.out.println("highestMonth: " + highestMonth);
//        System.out.println("highestDay: " + highestDay);
//        System.out.println("highestHour: " + highestHour);
//        System.out.println("highestMinute: " + highestMinute);
//        System.out.println("highestSecond: " + highestSecond);

        return LocalDateTime.of(highestYear, highestMonth, highestDay, highestHour, highestMinute, highestSecond);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}