import java.util.Scanner;
import java.util.Deque; // Using Deque interface
import java.util.ArrayDeque; // Using ArrayDeque as the implementation

/**
 * Checks if a string of brackets (parentheses, curly braces, and square brackets)
 * is correctly balanced and nested using the standard Stack/Deque data structure algorithm.
 * * NOTE: Using Deque (implemented by ArrayDeque) is the modern, preferred way
 * to use a stack in Java, as the legacy Stack class is often discouraged.
 */
public class Brackets {

    /**
     * Examines the input string to determine if the brackets are balanced.
     * * @param s The input string containing brackets.
     * @return true if the brackets are balanced, false otherwise.
     */
    public static boolean isBalanced(String s) {
        // 1. Create an instance of a Deque (using ArrayDeque for efficiency) to store opening brackets
        // Deque methods push(), pop(), and isEmpty() provide the LIFO stack behavior.
        Deque<Character> stack = new ArrayDeque<>();

        // 2. Traverse the input string
        for (char ch : s.toCharArray()) {

            // If the current character is an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If the current character is a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If the stack is empty, there is no corresponding opening bracket for this closing one.
                if (stack.isEmpty()) {
                    return false;
                }

                // 3. Remove (pop) the top element from the stack
                char top = stack.pop();

                // 4. Check if the popped bracket matches the current closing bracket
                // If the types do not match, parentheses are not balanced
                if (ch == ')' && top != '(') {
                    return false;
                } else if (ch == '}' && top != '{') {
                    return false;
                } else if (ch == ']' && top != '[') {
                    return false;
                }
            }
            // Ignore any other characters
        }

        // 5. If the stack is empty after the loop, everything matched up!
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();

        boolean result = isBalanced(input);

        System.out.println(result);

    }
}
