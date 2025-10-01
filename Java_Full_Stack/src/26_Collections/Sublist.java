import java.util.*;
import java.util.stream.Collectors;

class MainSublist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String integersInput =  scanner.nextLine();
        String sublistInput = scanner.nextLine();

        List<Integer> integers = inputToList(integersInput);
        List<Integer> sublist = inputToList(sublistInput);
        Collections.shuffle(integers);

        System.out.println(Collections.indexOfSubList(integers, sublist)
                + " "
                + Collections.lastIndexOfSubList(integers, sublist));
    }

    static List<Integer> inputToList(String input) {
        return Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}