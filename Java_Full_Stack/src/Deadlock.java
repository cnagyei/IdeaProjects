class DeadlockExample {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {

        // Thread 1: Acquires lock1, sleeps, then tries to get lock2
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) { // synchronized keyword used to prevent the block from access by multiple threads at the same time
                System.out.println("Thread 1: Holding lock 1...");
                try {
                    // Simulating a task that takes time, but holds onto the lock.
                    // This is the critical point.
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 and lock 2.");
                }
            }
        });

        // Thread 2: Acquires lock2, sleeps, then tries to get lock1
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) { // synchronized keyword used to prevent the block from access by multiple threads at the same time
                System.out.println("Thread 2: Holding lock 2...");
                try {
                    // Thread 2 also sleeps, holding onto its lock.
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 2 and lock 1.");
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("Main thread finished starting worker threads.");
    }
}
