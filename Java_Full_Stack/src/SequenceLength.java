/*
The length of the sequence
For its input, the program gets a sequence of non-negative integers; each integer is
written on a separate line. The sequence ends with an integer 0; when the program reads 0,
it should end its work and output the length of the sequence (not counting the final 0).
Don’t read numbers following the number 0.
*/
import java.util.Scanner;

public class SequenceLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, count = 0;

        do {
            number = scanner.nextInt();
            count += number != 0 ? 1 : 0;
        } while (number != 0);

        System.out.println(count);
    }
}
