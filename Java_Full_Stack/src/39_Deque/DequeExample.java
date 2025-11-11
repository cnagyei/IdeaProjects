import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.offerLast("first");
        stack.offerLast("second");
        stack.offerLast("third");

        System.out.println(stack);

        stack.pollLast();
        System.out.println(stack);

        stack.pollFirst();
        System.out.println(stack);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        System.out.println(deque);

        deque.push(5);
        System.out.println(deque);

        System.out.println(deque.peek());

        System.out.println(deque.pop());

        System.out.println(deque);
    }
}
