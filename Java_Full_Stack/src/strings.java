import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        System.out.println(Arrays.toString(chars));

        String stringFromChars = String.valueOf(chars);
        System.out.println(stringFromChars);

        char[] charsFromString = stringFromChars.toCharArray();
        System.out.println(Arrays.toString(charsFromString));

        String theSameString = new String(charsFromString);
        System.out.println(theSameString);

        // Another way
        String text = "Hello";
        String[] parts = text.split(""); // Splits the string into parts
        System.out.println(Arrays.toString(parts));

        String phoneNumber = "+233-24-627-5666";
        String[] phoneNumberParts = phoneNumber.split("-");
        System.out.println(Arrays.toString(phoneNumberParts));

        String toDo = "When I come home, I'll program, cook, and watch a movie!";
        String[] toDoParts = toDo.split(",");
        System.out.println(Arrays.toString(toDoParts));

        String scientistName = "Isaac Newton";

        for (int i = 0; i < scientistName.length(); i++) {
            System.out.print(scientistName.charAt(i) + " ");
        }

    }
}
