class UnexpectedResults {
    public static void main(String[] args) {
        System.out.println("Main started");
        count(1, 10);
        System.out.println("Main ended");
    }

    public static void count(int start, int to) {
        System.out.println("count() started");
        while (start < to) {
            System.out.println(start);
            start++;
        }
        System.out.println("count() ended");
    }
}