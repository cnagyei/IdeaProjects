import java.util.function.*;
import java.util.function.Predicate;
class Functions_01 {
    public static void main(String[] args) {

        // 01 - FUNCTIONS

        // String to Integer function
        Function<String, Integer> converter = Integer::parseInt;
        System.out.println(converter.apply("123"));

        // String to int function
        ToIntFunction<String> converter2 = Integer::parseInt;
        System.out.println(converter2.applyAsInt("123"));

        // (Integer, Integer) to Integer function
        BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a + b;
        System.out.println(sumFunction.apply(10, 20));

        // 02 - OPERATORS

        // Long to Long multiplier
        UnaryOperator<Long> longMultiplier = val -> 1000 * val;
        System.out.println(longMultiplier.apply(1000L));

        // int to int operator
        IntUnaryOperator intSquare = intVal -> intVal * intVal;
        System.out.println(intSquare.applyAsInt(5));

        // (String, String) to String operator
        BinaryOperator<String> appender = (str1, str2) -> str1 + str2;
        System.out.println(appender.apply("Hello ", "World"));

        // 03 - PREDICATES

        // Character to boolean predicate
        Predicate<Character> isDigit = Character::isDigit;
        System.out.println(isDigit.test('a'));

        Predicate<Integer> isEven = val -> val % 2 == 0;
        System.out.println(isEven.test(5));

        // 04 - SUPPLIERS
        Supplier<String> printHello = () -> "Hello";
        System.out.println(printHello.get());

        BooleanSupplier isTrue = () -> true;
        System.out.println(isTrue.getAsBoolean());

        isTrue = () -> false;
        System.out.println(isTrue.getAsBoolean());

        LongSupplier longSupplier = () -> 1L;
        System.out.println(longSupplier.getAsLong());

        // 5 - CONSUMER
        Consumer<String> p = System.out::println;
        p.accept("Hello");

        MyFuncInterface<String> printName = System.out::println;
        printName.print("My interface");

        MyFuncInterface<String> printName2 = (str) -> System.out.println(str);
        printName2.print("My interface2");

        LongUnaryOperator longUnaryOperator = val -> val + 1;
        LongFunction<Long> longFunction = val -> val + 1;
        Function<Long, Long> longFunction2 = val -> val + 1;
        ToLongFunction<Long> longFunction3 = val -> val + 1;
        BiFunction<Long, Long, Long>  longFunction4 = (a, b) -> a + b;
    }
}

interface MyFuncInterface<T> {

    void print(T toPrint);
}
