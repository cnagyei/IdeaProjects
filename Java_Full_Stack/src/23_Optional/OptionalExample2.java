import java.util.Optional;
import java.util.Scanner;

class MainOptional {
    public static void main(String[] args) {
        InputStringReader reader = new InputStringReader();
        Optional<String> value = reader.getValue();
        if (value.isPresent()) {
            System.out.println("Value is present: " + value.get());
        } else {
            System.out.println("Value is empty");
        }
    }
}

/*
Print "Value is empty" if the input string equals "empty"; otherwise output the string
 */
class InputStringReader {
    public Optional<String> getValue() {
        String text = new Scanner(System.in).nextLine();
        if (text.equals("empty")) {
            return Optional.empty();
        } else {
            Optional<String> str = Optional.of(text);
            return str;
        }
    }
}