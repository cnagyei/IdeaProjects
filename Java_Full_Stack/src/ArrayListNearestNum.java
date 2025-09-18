import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Find the nearest number

Write a program that finds the elements in an array of integers that are closest to a given integer. If you find
several integers with the same distance to N, you should output all of them in ascending order. If there are
several equal numbers, output them all.
Input: a set of integers and a number N.

Output: some number(s) from the given array.

Sample Input 1:
1 2 4 5
3

Sample Output 1:
2 4
Explain code
Sample Input 2:

1 2 3 4
6
Explain code
Sample Output 2:
4

Sample Input 3:
5 1 3 3 1 5
4

Sample Output 3:
3 3 5 5
 */
public class ArrayListNearestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Sort Array
         * Check whether num - 1 is in list, then check frequency
         * Add number per frequency to new list
         */
        ArrayList<Integer> list = new ArrayList<>();
        int targetNumber = scanner.nextInt();

    }

    private static ArrayList<Integer> findNearestNumber(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        Collections.sort(list);


        return result;
    }



    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
