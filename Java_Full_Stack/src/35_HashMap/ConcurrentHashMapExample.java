import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> map = new ConcurrentHashMap<>();

        Thread writer1 = new Thread(() -> addNegativeNumbers(map));
        Thread writer2 = new Thread(() -> addNegativeNumbers(map));

        writer1.start();
        writer2.start();

        writer1.join();
        writer2.join();

        System.out.println(map.size());
    }

    private static void addPositiveNumbers(Map<Integer, String> target) {
        for (int i = 0; i < 100_000; i++) {
            target.put(i, "Number is " + i);
        }
    }

    private static void addNegativeNumbers(Map<Integer, String> target) {
        for (int i = -100_000; i < 0; i++) {
            target.put(i, "Number is " + i);
        }
    }
}
