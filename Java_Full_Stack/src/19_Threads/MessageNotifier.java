/*
Message notifier as a thread

Write a service that takes a message and the number of its repetitions as constructor parameters and prints the
message to the standard output the specified number of times.

Use the provided template for your class.

The testing system will start the service as a regular thread.

Sample Input 1:
Hello, Mary
3

Sample Output 1:
Hello, Mary
Hello, Mary
Hello, Mary
 */

class MessageNotifier extends Thread {

    private final String msg;
    private final int repeats;

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        for (int i = 1; i <= repeats; i++) {
            System.out.println(msg);
        }
    }
}

class MainMessageNotifier {
    public static void main(String[] args) {
        Thread thread = new Thread(new MessageNotifier("Hello Mary", 3));
        thread.start();
    }
}