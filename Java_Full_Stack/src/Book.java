/*
Creating a class for a book with private properties
Create a default class named 'Book' that represents a book in a library. The class should contain
three private properties: 'title' (String), 'author' (String), and 'numberOfPages' (int). The class should also
contain public methods to set (mutator) and get (accessor) these properties. The mutator methods should not
allow to set an empty string for 'title' and 'author,' or a negative or zero value for 'numberOfPages'.
Instead, if such a value is attempted to be set, the methods should keep the properties unchanged.
Once the class is created, create an object of this class, set the properties using the mutator methods and
get values using the accessor methods. Take three lines of input, the first line is a string (title),
the second line is also a string (author), and the third line is an integer (numberOfPages).
The output should be three lines, printing the title, author, and the number of pages in the same order.

Sample Input 1:
The Great Gatsby
F. Scott Fitzgerald
180

Sample Output 1:
The Great Gatsby
F. Scott Fitzgerald
180

Sample Input 2:
To Kill a Mockingbird
Harper Lee
281

Sample Output 2:
To Kill a Mockingbird
Harper Lee
281
 */
import java.util.Scanner;

// Creating class
public class Book {
    // set up three private properties
    private String title;
    private String author;
    private int numberOfPages;

    // title getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    // author getter and setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        }
    }

    // numberOfPages getter and setter
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }
    }
}

class mainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        // Your code here
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int numberOfPages = scanner.nextInt();

        book.setTitle(title);
        book.setAuthor(author);
        book.setNumberOfPages(numberOfPages);

        // Then use the accessor methods to get and print these values.
        // Your code here
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }
}