import java.util.*;
import java.util.stream.Collectors;

class MainRotating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();       // Rows
        int columns = scanner.nextInt();    // Columns

        scanner.nextLine();

        // Create a matrix
        List<List<Integer>> matrix = new ArrayList<>();


        for (int i = 0; i < rows; i++) {            // For each row
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {     // Accept column values
                row.add(scanner.nextInt());         // Add to inner list
            }
            matrix.add(row);                        // Add inner list to matrix
        }

        // Accept rotating distance
        int rotationDistance = scanner.nextInt();

        // Rotate
        Collections.rotate(matrix, rotationDistance);

        // Format into table
        matrix.forEach(row -> {
            String rowString = row.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.println(rowString);
        });
    }

    // Convert string input to integer
    static List<Integer> stringToIntegerList(String input) {
        return Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}