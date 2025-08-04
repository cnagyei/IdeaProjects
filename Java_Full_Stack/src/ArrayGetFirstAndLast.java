/*
Get first and last elements
Write a method named getFirstAndLast. The method must take an array of ints and return a new array of ints.
The returned array must contain two elements: the first and the last elements of the input array.
It is guaranteed that the input array always has at least one element.
 */
import java.util.*;

public class ArrayGetFirstAndLast {

    // write a method here
    public static int[] getFirstAndLast(int[] array) {
        int[] newArray = new int[2];

        newArray[0] = array[0];
        newArray[1] = array[array.length - 1];

        return newArray;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}

