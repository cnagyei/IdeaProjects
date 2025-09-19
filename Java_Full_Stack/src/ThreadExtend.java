// Create a new thread by extending the Thread class and overriding its run method
public class ThreadExtend extends Thread{

    @Override
        public void run() {
        String helloMsg = String.format("Hello, I'm %s", getName());
        System.out.println(helloMsg);
    }
}

// Create a new thread by implementing the Runnable interface and passing the implementation to the constructor
// of the Thread class.

class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String helloMsg =  String.format("Hello, I'm %s", threadName);
        System.out.println(helloMsg);
    }
}

class MainThreadCustomCreate {
    public static void main(String[] args) {

        Thread t0 = new ThreadExtend();
        t0.run();

        Thread t1 = new Thread(new ThreadRunnable());
        t1.run();

        Thread myThread = new Thread(new ThreadRunnable(), "myThread");
        myThread.run();

        ThreadExtend threadExtend = new ThreadExtend();
        threadExtend.run();

        ThreadExtend threadExtend1 = new ThreadExtend();
        threadExtend1.run();

        ThreadRunnable threadRunnable = new ThreadRunnable();
        threadRunnable.run();

        // Using lambda
        Thread t2 = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            String helloMsg =  String.format("Hello, I'm %s", threadName);
        });

        t0.start();
        t1.start();
        t2.start();

        System.out.println("Finished");
    }
}
