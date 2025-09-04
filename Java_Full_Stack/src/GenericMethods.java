class GenericMethods {

    // Generic static methods
    public static <T> T doSomething(T t) {
        return t;
    }

    public static <E> int arrayLength(E[] array) {
        return array.length;
    }

    public static <U> void printArray(U[] array) {
        for (U element : array) {
            System.out.println(element);
        }
    }

    // Multiple type parameters
    public static <S, U> int addTwoArrayLength(S[] array1, U[] array2) {
        return array1.length + array2.length;
    }

    // Generic instance methods
    public <T> T getParameterizedObject(T t) {
        return t;
    }
}

class MainGenericMethods {
    public static void main(String[] args) {

        // Call generic static methods

        // Take integer array
        System.out.println("// Take integer array");
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println(GenericMethods.arrayLength(intArray));

        // Take string array
        System.out.println("// Take string array");
        String[] stringArray = {"a", "b", "c", "d"};
        System.out.println(GenericMethods.arrayLength(stringArray));

        // Print int array
        System.out.println("// Print int array");
        GenericMethods.printArray(intArray);

        // Print string array
        System.out.println("// Print string array");
        GenericMethods.printArray(stringArray);

        // Add two array lengths
        int totalLength = GenericMethods.addTwoArrayLength(intArray, stringArray);
        System.out.println("Total length: " + totalLength);

        // Call generic instance methods
        GenericMethods instance = new GenericMethods();
        System.out.println(instance.getParameterizedObject(intArray));
        System.out.println(instance.getParameterizedObject(stringArray));
        System.out.println(instance.getParameterizedObject(20));
        System.out.println(instance.getParameterizedObject("Hello World"));
        System.out.println(instance.getParameterizedObject('A'));

        /*
        Static methods cannot use type parameters of their class! Type parameters of the class these methods
        belong to can only be used in instance methods. If you want to use type parameters in a static method,
        declare this method's own type parameters.
         */
    }
}