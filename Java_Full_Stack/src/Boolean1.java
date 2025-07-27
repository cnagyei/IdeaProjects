import java.util.Scanner;

class Boolean1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter situations here: ");
        boolean cold = scanner.nextBoolean();
        boolean dry = scanner.nextBoolean();
        boolean summer = scanner.nextBoolean();
        boolean trekking = dry && (!cold || summer);

        if (trekking) {
            System.out.println("True - Let's go trekking!");
        } else {

            System.out.println("False - It's dangerous trekking at this time!");
        }
    }
}