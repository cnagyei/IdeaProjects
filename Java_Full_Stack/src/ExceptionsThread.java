class MainExceptionsThread {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> {
            String str = "1";
            System.out.println("Length is " + str.length());
        }, "secondary");

        thread.start();

        System.out.println(thread.getName());
        System.out.println("main");

        // Main error
        System.out.println(20 / 0);

        Thread newThread = new Thread(() -> {
            System.out.println("My new thread");
        }, "caleb");

        newThread.start();

    }
}