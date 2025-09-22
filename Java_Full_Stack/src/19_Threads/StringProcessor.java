import java.util.Scanner;

/*
String processor
Write a class with the name StringProcessor that extends the Thread class. The class must have a method that
reads strings (line by line) from the standard input. If a read string has a character in lower case, the processor
must output the string in upper case; otherwise, the processor must output "FINISHED" and stop the processing.

Use the provided template for your class. Write any additional methods if you need them.

The testing system will start the processor as a regular thread.

Sample Input 1:
line
LINE

Sample Output 1:
LINE
FINISHED

Sample Input 2:
threadS
PROCeSSES
TASKS

Sample Output 2:
THREADS
PROCESSES
FINISHED
 */
class StringProcessor extends Thread {
    final Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        while (scanner.hasNext()) {
            boolean hasLower = false;
            String str = scanner.next();
            for (char ch : str.toCharArray()) {
                if (Character.isLowerCase(ch)) {
                    hasLower = true;
                }
            }
            if (hasLower) {
                System.out.println(str.toUpperCase());
            } else {
                System.out.println("FINISHED");
            }
        }
    }
}

class MainStringProcessor {
    public static void main(String[] args) {
        Thread thread = new Thread(new StringProcessor());
        thread.start();
    }
}
