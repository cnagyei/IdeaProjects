import java.util.Scanner;

/*
Writing a thread for printing numbers
Write a class named NumbersThread that extends the Thread class. The class must have a constructor that takes two
integer numbers from and to as range borders.

Implement the method run. It must print all numbers from the given range (inclusive) to the standard output.

Use the provided template.
Sample Input 1:
1 3

Sample Output 1:
1
2
3

Sample Input 2:
2 2

Sample Output 2:
2
 */
public class NumbersThread extends Thread {
    private final int from;
    private final int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
}

class MainNumbersThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        Thread t1 = new NumbersThread(from, to);
        t1.start();
    }
}
