class MyThreadEx extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + getName());
    }
}

class MainMyThread {
    public static void main(String[] args) throws InterruptedException {
        MyThreadEx t1 = new MyThreadEx();
        t1.setName("My-thread-1");
        t1.start();

        t1.join();

        MyThreadEx t2 = new MyThreadEx();
        t2.setName("My-thread-2");
        t2.start();

        System.out.println("output-1");

        t2.join();

        System.out.println("output-2");
    }
}