public class Thread1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Thread thread = Thread.currentThread();

        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread State: " + thread.getState());
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Is Interrupted: " + thread.isInterrupted());
        System.out.println("Is Alive: " + thread.isAlive());
        System.out.println("Is Daemon: " + thread.isDaemon());

        thread.setName("Caleb Thread");
        System.out.println("New Thread Name: " + thread.getName());

        System.out.println(thread.MIN_PRIORITY);
        System.out.println(thread.MAX_PRIORITY);
    }
}
