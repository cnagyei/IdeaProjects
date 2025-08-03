/*
Calculator with four methods
In a template below you have a simple calculator that subtracts, sums, divides, and multiplies the two
numbers inside the switch statement. Now, we've decided to upgrade it to perform more complex tasks, such as
logarithmic functions. For that, separate methods are a better solution. Let's start with decomposing what we have.
Take a look at the template and decompose operations of the calculator into
four methods: subtractTwoNumbers(long a, long b) for subtraction, sumTwoNumbers(long a, long b) for adding,
divideTwoNumbers(long a, long b) for integer division and multiplyTwoNumbers(long a, long b) for multiplication.
Each method should print the result of calculations.
Note that you can't divide by zero. In case your second argument is zero, you should print the "Division by 0!" message.
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
        }
    }
}

class SimpleCalculator {
    // Subtract
    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }

    // Sum
    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }

    // Divide
    public static void divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }

    // Multiply
    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }
}
