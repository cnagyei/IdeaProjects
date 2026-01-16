import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String newString = "";
        int length = text.length();

        // Odd: 0 - length/2; length/2 + 1 - length

        // Even: 0 - length/2 - 1; length/2 + 1 - length
        if (text.length() % 2 == 0) {
            newString += text.substring(0, (length / 2 - 1));
            newString += text.substring((length / 2 + 1), length);
        } else {
            newString += text.substring(0, (length / 2));
            newString += text.substring((length / 2 + 1), length);
        }

        System.out.println(newString);
    }
}
