import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MainFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> chars = new ArrayList<>();

        String inputString = scanner.nextLine();
        char targetChar = scanner.next().charAt(0);

        String formatChars = inputString.chars()
                .filter(c -> c != ' ')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        for (int i = 0; i < formatChars.length(); i++) {
            chars.add(formatChars.charAt(i));
        }
        System.out.println(Collections.frequency(chars, targetChar));

        System.out.println(Collections.lastIndexOfSubList(chars, List.of('c', 'd')));
    }
}