public class ThreadUtil {
    public static String getName(Thread thread){
        return thread.getName();
    }

    public static void printIfDaemon(Thread thread){
        if (thread.isDaemon()){
            System.out.println("daemon");
        } else {
            System.out.println("not daemon");
        }
    }
}

class MainThread2 {
    public static void main(String[] args) {
        ThreadUtil threadUtil = new ThreadUtil();
        threadUtil.printIfDaemon(Thread.currentThread());
    }
}
