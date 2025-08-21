import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ExceptionsHierarchy {
    public static String readLineFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("File.txt"));
        return scanner.nextLine();
    }
}

class mainExceptionsHierarchy {
    public static void main(String[] args) {
        try {
            String line = ExceptionsHierarchy.readLineFromFile();
            System.out.println("The line from the file is: " + line);
        } catch (FileNotFoundException e) {
            // This code runs if file is not found
            System.out.println("Error: The file was not found! " + e.getMessage());
        }
    }
}