public class Joining {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Worker();
        worker.start();

        Thread.sleep(100L);
        System.out.println("Do something useful");

        worker.join(3000L); // Waiting for the worker

        System.out.println("The program stopped");
    }
}

class Worker extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Starting a task");
            Thread.sleep(2000L); // Solves a difficult task
            System.out.println("Task is finished");
        } catch (Exception ignored) {

        }
    }
}
