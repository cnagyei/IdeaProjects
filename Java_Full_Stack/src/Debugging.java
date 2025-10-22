public class Debugging {
    public static void main(String[] args) {
        System.out.println("Hello World");

        whatever();
    }

    static void whatever() {
        char rangeStart = 'A';
        char rangeEnd = 'Y';
        char findLetter = 'Q';
        int counter = 0;

        for (char ch = rangeStart; ch <= rangeEnd; ch++) {
            counter++;
            if (ch == findLetter) {
                System.out.printf("Character %s is within range %s-%s", findLetter, rangeStart, rangeEnd);
                return;
            }
        }
        System.out.printf("Character %s is not within range %s-%s", findLetter, rangeStart, rangeEnd);
    }
}