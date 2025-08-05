import java.util.Scanner;

class MakingTwins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); // Select character based on index
            System.out.print(c);
            System.out.print(c);
        }
    }
}