import java.util.ArrayDeque;
import java.util.Deque;

class Stack {
    public static void main(String[] args) {
            Deque<String> stack = new ArrayDeque<>();
            stack.push("1");
            stack.push("2");
            stack.push("3");
            stack.push("4");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}