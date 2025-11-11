import java.util.Deque;
import java.util.ArrayDeque;

public class DequeOutput {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        states.add("France");
        states.push("UK");
        states.offerLast("Norway");

        String sPop = states.pop();
        String sPeek = states.peek();
        String sPeekLast = states.peekLast();
        states.offer(sPop);
        String sPollLast = states.pollLast();

        while (states.peek() != null) {
            System.out.print(states.pop());
        }
    }
}
