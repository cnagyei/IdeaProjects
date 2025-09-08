/*
Check for null

Define and implement a generic static method hasNull that returns true if an input array has null element
and false otherwise.

Sample Input 1:
String
There are elements of the array

Sample Output 1:
false
 */

// do not remove imports
import java.util.*;
import java.util.function.Function;

class ArrayUtils2 {
    static <T> boolean hasNull(T[] array) {
        if (array == null) {
            return true;
        }
        for (T t : array) {
            if (t == null) {
                return true;
            }
        }
        return false;
    }

    static <S> S getFirst(S[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return  array[0];
    }

    static <U> U[] invert(U[] array) {
        if ((array == null) || (array.length == 0)) {
            return array;
        }

        int start = 0;
        int end = array.length - 1;

        while  (start < end) {
            U temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move pointers inward
            start++;
            end--;
        }
        return array;
    }
}

class MainArrayUtils2 {
    public static void main(String[] args) {
        Integer[] intArray = {null, 1, 2, 3};
        Integer[] intArray2 = {10, 6, 2, 3};
        String[] stringArray = {"one", "two", "three"};
        String[] emptyStringArray = {""};
        Integer[] nullArray = null;

        // hasNull
        System.out.println(ArrayUtils2.hasNull(intArray));
        System.out.println(ArrayUtils2.hasNull(stringArray));
        System.out.println(ArrayUtils2.hasNull(emptyStringArray));
        System.out.println(ArrayUtils2.hasNull(nullArray));

        System.out.println("========");

        // getFirst
        System.out.println(ArrayUtils2.getFirst(intArray));
        System.out.println(ArrayUtils2.getFirst(stringArray));
        System.out.println(ArrayUtils2.getFirst(emptyStringArray));
        System.out.println(ArrayUtils2.getFirst(nullArray));

        System.out.println("========");

        // invert
        System.out.println(Arrays.toString(ArrayUtils2.invert(intArray)));
        System.out.println();
        ArrayUtils2.invert(intArray2);
        System.out.println();
        ArrayUtils2.invert(stringArray);
        System.out.println();
        ArrayUtils2.invert(emptyStringArray);
        System.out.println();
        ArrayUtils2.invert(nullArray);
    }
}