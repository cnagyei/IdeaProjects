class MainCounterData {
    public static void main(String[] args) throws InterruptedException {
        CounterData counter = new CounterData();

        counter.increment();
        counter.increment();

        CounterThread thread = new CounterThread(counter);
        thread.start();

        thread.join();

        System.out.println(counter.getValue());
    }
}

class CounterThread extends Thread {
    private CounterData counter;

    public CounterThread(CounterData counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
        counter.increment();
        counter.increment();
    }
}

public class CounterData {

    private int value = 0;

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}

