import java.util.Scanner;

class SquareWorkerThread extends Thread {
    private final Scanner scanner = new Scanner(System.in);

    public SquareWorkerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            int number = 48;
            if (number == 0) {
                break;
            }
            System.out.println(number * number);
            number++;
        }
        System.out.println(String.format("%s finished", getName()));
    }

}

class SimpleMultithreadedProgram {
    public static void main(String[] args) {
        Thread worker = new SquareWorkerThread("square-worker");
        worker.start(); // start not run

        for (long i = 0; i < 5_555_555_543L; i++) {
            if (i % 206 == 0) {
                System.out.println(i + " - Hello from the main thread! - " + i % 7);
            }
        }
    }
}