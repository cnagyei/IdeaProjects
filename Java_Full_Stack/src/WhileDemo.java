public class WhileDemo {
    public static void main(String[] args) {
        char letter = 'a';

        while (letter <= 'z') {
            System.out.print(letter);
            letter++;
        }
        System.out.print(letter);
        System.out.print(++letter);
        System.out.print(++letter);
        System.out.print(++letter);
        System.out.print(++letter);
    }
}