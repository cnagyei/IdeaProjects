import java.util.Optional;
import java.util.Scanner;

class OptionalExample {
    public static void main(String[] args) {
        Optional<String> absent = Optional.empty();
        Optional<String> present = Optional.of("Hello");

        System.out.println(absent.isPresent());
        System.out.println(present.isPresent());

        System.out.println(absent.isEmpty());
        System.out.println(present.isEmpty());

        // Optional<String> empty = Optional.of(null); // Causes NPE
        Optional<String> nullable = Optional.ofNullable(null);

        // Example
        String message = "";
        Optional<String> optional = Optional.ofNullable(message);
        System.out.println(optional.isPresent());

        // Getting Value
        Optional<String> optName = Optional.of(new Scanner(System.in).nextLine());
        String name = optName.get();
        System.out.println(name);

        // Empty object throws NoSuchElementException
        Optional<String> empty = Optional.ofNullable(null);
        // name = empty.get(); // Throws NSEE
        // System.out.println(name);

        // orElse
        String myName = null;
        String stringName = Optional.ofNullable(myName).orElse("Hello");
        System.out.println(stringName);

        // orElseGet
        String someString = Optional.ofNullable(myName).orElseGet(() -> "Nice");
        System.out.println(someString);

        someString = Optional.ofNullable(myName).orElseGet(OptionalEx::getName);
        System.out.println(someString);
    }
}

class OptionalEx {
    static String getName() {
        return "Abenaa Sarpong Agyei";
    }
}