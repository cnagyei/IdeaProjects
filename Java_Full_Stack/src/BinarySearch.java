class BinarySearch {
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        // write your code here
        return(java.util.Arrays.binarySearch(nums, key));
    }
}

class ArraySorting {
    /**
     * @param array unordered sequence of strings
     * @return ordered array of strings
     */
    public static String[] sortArray(String[] array) {
        // write your code here
        java.util.Arrays.sort(array);
        return array;
    }
}

class InputReader {
    public static String getString() {
        // write your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }
}