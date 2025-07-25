import java.util.Scanner;

public class Full_Line {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Capture all tokens on one line
        String sentence = sc.nextLine();

        // Print output
        System.out.println("The sentence reads: " + sentence);
    }
}