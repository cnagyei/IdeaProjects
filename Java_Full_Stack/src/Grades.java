/*
Numbers divisible by six

Find the sum of numbers divisible by 6 in the given sequence of natural numbers.

The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.

It is guaranteed that there is always a number divisible by 6 in the sequence.

 */
import java.util.Scanner;

class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradeCount = scanner.nextInt(); // Enter count of numbers
        scanner.nextLine(); // Consume leftover line

        int gradeCountD = 0;
        int gradeCountC = 0;
        int gradeCountB = 0;
        int gradeCountA = 0;

        for (int i = 0; i < gradeCount; i++) {
            String grade = scanner.nextLine(); // Accept multiple entries based on count
            switch (grade) {
                case "D" -> gradeCountD++;
                case "C" -> gradeCountC++;
                case "B" -> gradeCountB++;
                case "A" -> gradeCountA++;
            }
        }
        System.out.print(gradeCountD + " ");
        System.out.print(gradeCountC + " ");
        System.out.print(gradeCountB + " ");
        System.out.print(gradeCountA);

        scanner.close();
    }
}