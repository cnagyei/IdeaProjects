import java.util.*;
import java.util.stream.Collectors;

public class MaxNumber {

    public static int findMaxByIterator(Iterator<Integer> iterator) {
        int maxValue = 0;
        while (iterator.hasNext()) {
            int currentValue = iterator.next();
            if (currentValue > maxValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }

    /* Do not change code below */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(findMaxByIterator(list.iterator()));
    }
}