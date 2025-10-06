public class SyncEx {
    public static void main(String[] args) throws InterruptedException {
        Incrementor incrementor = new Incrementor();
        incrementor.setCounter(0);

        SynThread thread1 = new SynThread(incrementor);
        SynThread thread2 = new SynThread(incrementor);
        thread1.start();
        thread2.start();

        thread1.join();
        System.out.println(incrementor.getCounter());

        thread2.join();
        System.out.println(incrementor.getCounter());

        System.out.println("main");
    }
}

class SynThread  extends Thread {
    private final Incrementor incrementor;

    public SynThread(Incrementor incrementor) {
        this.incrementor = incrementor;
    }

    public void run() {
        for (int i = 0; i < 10000000; i++) {
            incrementor.increment();
        }
    }
}

class Incrementor {
    private int counter = 0;


    public static void printWelcome() {
        System.out.println("Welcome");

        synchronized (Incrementor.class) {
            System.out.println("Welcome again");
        }
    }

    public synchronized void increment() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;

        synchronized (Incrementor.class) {
            System.out.println("setCounter");
        }
    }
}
