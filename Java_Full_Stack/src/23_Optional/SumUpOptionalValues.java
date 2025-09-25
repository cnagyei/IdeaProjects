/*
Write a code in the Main class that sums up all values and prints the result. If Optional object is empty, just skip it.

Sample Input 1:
3
1
2
3

Sample Output 1:
6

Sample Input 2:
5
1
2
null
4
5

Sample Output 2:
12
 */
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class MainSumUpOptionalValues {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        // use provider.getValues() to get List<Optional<Integer>>
        System.out.println(provider.getValues());

        int sum = provider.getValues().stream()
                // Unpack and Filter: Optional::stream converts Optional[N] to Stream[N]
                // and Optional.empty() to an empty stream. flatMap merges them
                .flatMap(Optional::stream)
                .mapToInt(Integer::intValue) // Map to Primitive: Convert Stream<Integer> to the efficient IntStream.
                .sum(); // Sum: Calculate the total
        System.out.println(sum);

    }
}

class ValueProvider {
    private List<Optional<Integer>> opts; // cache to provide reproducing method invocation

    public List<Optional<Integer>> getValues() {
        if (opts != null) {
            return opts;
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        opts = java.util.stream.IntStream
                .rangeClosed(1, number)
                .mapToObj(n -> {
                    String val = scanner.next();
                    return "null".equals(val) ?
                            Optional.<Integer>empty() :
                            Optional.of(Integer.valueOf(val));
                })
                .collect(java.util.stream.Collectors.toList());

        return opts;
    }
}