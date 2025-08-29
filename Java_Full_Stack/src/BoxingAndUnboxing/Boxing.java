class MainBoxing {
    public static void main(String[] args) {

        // Manual boxing and unboxing
        int primitive = 100;
        Integer integer = Integer.valueOf(primitive); // boxing
        int anotherPrimitive = integer.intValue(); // Unboxing

        // Auto-boxing and auto-unboxing
        double primitiveDouble = 8.384;
        Double boxedDouble = primitiveDouble; // Auto-boxing
        double anotherPrimitiveDouble = boxedDouble;


    }
}