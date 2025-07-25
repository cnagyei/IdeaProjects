import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		System.out.println("Hello, World!");

		Scanner sc = new Scanner(System.in);

		// Capture only one token or word
		String firstName = sc.next();
		String lastName = sc.next();

		//Capture tokens on one line
		String fullName = sc.nextLine();

		System.out.println("Hello " + firstName + " " + lastName + "!");
		System.out.println("Hi Everyone! My full name is " + fullName + "!");

		sc.close();
	}
}
