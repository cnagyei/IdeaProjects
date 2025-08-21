/*
Method createFullName
In the code template below, you can see a program that creates a full name from the first and last names for
several people. Wouldn't it be much easier if we had a method that could do the same?
Your task is to create the method createFullName that takes firstName and lastName (in this order) and
returns the full name.
 */
import java.util.Scanner;

public class CreateFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String fullName = createFullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
