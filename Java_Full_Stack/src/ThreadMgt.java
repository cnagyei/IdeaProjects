import java.util.concurrent.TimeUnit;

public class ThreadMgt {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started Thread");
        Thread.sleep(5000L);
        System.out.println("Ended Thread");

        TimeUnit.MILLISECONDS.sleep(5000L);
        System.out.println("Started Thread");
        Thread.sleep(5000L);
        System.out.println("Finished Thread");

        TimeUnit.SECONDS.sleep(2);
        System.out.println("Thread waited for 2 seconds");
    }
}
