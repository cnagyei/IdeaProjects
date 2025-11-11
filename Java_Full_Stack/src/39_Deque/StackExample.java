import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = scanner.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int counter = 0; counter < numberOfInputs; counter++) {
            int input = scanner.nextInt();
            stack.push(input);
        }
        stack.forEach(System.out::println);
    }
}
