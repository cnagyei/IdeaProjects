import java.util.Locale;

/*
A lambda expression with seven arguments

Write a lambda expression that accepts seven (!) string arguments and returns a string in uppercase
concatenated from all of them (in the order of arguments).

Solution format. Submit your lambda expression with seven arguments in any valid format with ; at the end.

Examples (only with two args): (x, y) -> x + y; (x, y) -> { return x + y; };

Sample Input 1:
The lambda has too many string arguments.

Sample Output 1:
THELAMBDAHASTOOMANYSTRINGARGUMENTS.
 */
class Seven {
    public static SeptenaryStringFunction fun =
            (a, b, c, d, e, f, g) -> {
                String sentence = a + b + c + d + e + f + g;
                return sentence.toUpperCase(Locale.ENGLISH);
            };
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}

class MainSeven {
    public static void main(String[] args) {
        System.out.println(Seven.fun.apply("My", "name", "is", "Caleb", "Nana", "Agyei", "Barima"));
    }
}