/*
Max of two integers

Write a lambda expression that accepts two integer arguments and returns the maximum of them.

Try not to use the Math library.

Solution format. Submit your lambda expression in any valid format with ";" at the end.

Examples: (x, y) -> x + y; (x) -> { return x; };

Sample Input 1:
1 3

Sample Output 1:
3
 */
import java.util.function.IntBinaryOperator;

class Operator {

    public static IntBinaryOperator binaryOperator = (num1, num2) -> num1 > num2 ? num1 : num2;
}