public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci();
    }

    static void fibonacci() {
        int previous = 0;
        int current = 1;

        for (int i = 0; i <= 25; i++) {
            int swap = previous;
            previous = current;
            current += swap;
            System.out.println(current);
        }
    }
}
