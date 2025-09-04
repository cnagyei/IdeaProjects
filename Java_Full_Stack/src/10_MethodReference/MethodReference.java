import java.util.function.BiFunction;
import java.util.function.Function;

class MethodReference {
    public static void main(String[] args) {

        // Method reference
        BiFunction<Integer, Integer, Integer> max = Integer::max;
        System.out.println(max.apply(10, 20));

        // Lambda expression
        BiFunction<Integer, Integer, Integer> max2 = (x, y) -> Integer.max(x, y);
        System.out.println(max2.apply(10, 20));

        // Types

        // 1. Reference to a static method
        Function<Double, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(36.0));

        // 2. Reference to an instance method
        String whatsGoingOnText = "What's going on here?";
        Function<String, Integer> indexWithinWhatsGoingOn = whatsGoingOnText::indexOf;
        System.out.println(indexWithinWhatsGoingOn.apply("going"));
        System.out.println(indexWithinWhatsGoingOn.apply("hello"));

        // Lambda equivalent
        Function<String, Integer> text = inputText -> whatsGoingOnText.indexOf(inputText);
        System.out.println(text.apply("on"));

        // 3. Reference to an instance method of an object of a particular type
        Function<Long, Double> converter = Long::doubleValue;
        System.out.println(converter.apply(1L));

        // Lambda equivalent
        Function<Long, Double> converter2 = longValue -> longValue.doubleValue();
        System.out.println(converter2.apply(1L));

        // 4. Reference to a constructor
        Function<String, Computer> dellComputer = Computer::new;
        System.out.println(dellComputer.apply("dell")); // A new computer object
        System.out.println(dellComputer.apply("dell").name); // Access computer object field

        // Lambda equivalent
        Function<String, Computer> dellComputer2 = name -> new Computer(name);
        System.out.println(dellComputer2.apply("dell laptop"));
        System.out.println(dellComputer2.apply("dell laptop").name);
    }
}

class Computer {
    String name;
    String model;
    int age;

    Computer(String name) {
        this.name = name;
    }
}
