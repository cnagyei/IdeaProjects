import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayWorking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = readArrayList(scanner);
        int num =  scanner.nextInt();

        findNearestIntegers(list, num);
    }

    private static void findNearestIntegers(ArrayList<Integer> list, int num) {

        if (list.isEmpty()) {
            return;
        }

        // Create new list to output result
        ArrayList<Integer> newList = new ArrayList<>();

        // Sort list in ascending order
        Collections.sort(list);

        // Return last element if num is greater than last element
        if (num > list.getLast()) {
            int frequency = Collections.frequency(list, list.getLast());
            for (int i = 0; i < frequency; i++) {
                newList.add(list.getLast());
            }
            // Return first element if num is less than first element
        } else if (num < list.getFirst()) {
            int frequency = Collections.frequency(list, list.getFirst());
            for (int i = 0; i < frequency; i++) {
                newList.add(list.getFirst());
            }
        } else {
            if (!list.contains(num))
            {
                list.add(num);
            }

            // Sort again
            Collections.sort(list);

            // Check index of first occurrence of num to the left
            int firstIndex = list.indexOf(num);
            if (firstIndex != 0) {
                // Check the frequency of the nearest integer to the left
                int frequency = Collections.frequency(list, list.get(firstIndex - 1));

                for (int i = 0; i < frequency; i++) {
                    newList.add(list.get(firstIndex - 1));
                }
            }

            // Check last index of num to the right
            int lastIndex = list.lastIndexOf(num);
            if (lastIndex != list.size() - 1) {
                // Check frequency of next element to the right
                int frequency = Collections.frequency(list, list.get(lastIndex + 1));
                for (int i = 0; i < frequency; i++) {
                    newList.add(list.get(lastIndex + 1));
                }
            }
        }

        // Print new list
        for (int i = 0; i < newList.size(); i++) {
            System.out.print(newList.get(i));
            if (i < newList.size() - 1) {
                System.out.print(" ");
            }
        }
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
