class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

class MainThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}