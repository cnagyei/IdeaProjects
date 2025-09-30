import java.util.*;
import java.util.stream.Collectors;

class MainSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mainInput = scanner.nextLine();
        List<Integer> mainList = stringToIntegerList(mainInput);

        int numberOfSwaps = scanner.nextInt();

        scanner.nextLine();

        for  (int i = 0; i < numberOfSwaps; i++) {
            List<Integer> swapIndexes = stringToIntegerList(scanner.nextLine());
            Collections.swap(mainList, swapIndexes.getFirst(), swapIndexes.getLast());
        }

        String result = mainList.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        System.out.println(result);

        
    }

    static List<Integer> stringToIntegerList(String input) {
        return Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}