class WorkerEx extends Thread {
    private final String str;

    public WorkerEx(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str);
    }
}

class Application1 {
    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new WorkerEx("Hello from t1");
        Thread t2 = new WorkerEx("Hello from t2");
        Thread t3 = new WorkerEx("Hello from t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}