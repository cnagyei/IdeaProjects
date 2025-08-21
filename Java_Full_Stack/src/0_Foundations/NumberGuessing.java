import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 42;
        int userGuess;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < number) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > number) {
                System.out.println("Too high! Try again.");
            }
        } while (userGuess != number);

        System.out.println("Congratulations! You guessed the correct number: " + number);
    }
}