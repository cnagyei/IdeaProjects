/*
Print content
Define and implement a generic static method info that accepts a generic array and returns the content of the
input array as a String .

Examples:

if the argument is an int array {1, 2, 3}, the method should return the String: [1, 2, 3] ;
if the argument is a String array {"one", "two", "three"}, the method should return the String: [one, two, three] ;
if an argument is an empty array, String: [] is returned.
Sample Input 1:
Integer
8 11 3 7

Sample Output 1:
[8, 11, 3, 7]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils<T, S> {
    public static <T> String info(T[] array) {
        T helo = array[0];
        return Arrays.toString(array);
    }
}

class MainArrayUtils {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"one", "two", "three"};
        String[] emptyStringArray = {""};

        System.out.println(ArrayUtils.info(intArray));
        System.out.println(ArrayUtils.info(stringArray));
        System.out.println(ArrayUtils.info(emptyStringArray));
    }
}