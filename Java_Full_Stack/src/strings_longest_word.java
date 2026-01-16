import java.util.Scanner;

public class strings_longest_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        // Convert sentence string to array
        String[] sentenceParts = sentence.split(" ");
        int indexOfLongestWord = 0;
        int maxLength = 0;

        for (int i = 0; i < sentenceParts.length; i++) {
            if (sentenceParts[i].length() > maxLength) {
                maxLength = sentenceParts[i].length();
                indexOfLongestWord = i;
            }
        }
        System.out.println(sentenceParts[indexOfLongestWord]);

        String str = "Hello, Java";

        int i = str.length() - 1;
        while (i >= 1) {
            System.out.print(str.charAt(i));
            i--;
        }
    }
}