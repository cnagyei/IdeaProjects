/*Boxes
There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has
a size of X2 x Y2 x Z2.
You need to determine whether one of the boxes can be put inside the other. It should go in without sticking out.
To place one box within another, you can shift and rotate both boxes as you want. This means that the order
of integer inputs for a box is not important while comparing the boxes.

Important: two equally sized boxes cannot be placed inside one another. See the third test case as an
example of how the edge case should be treated.

Input consists of two lines:
the first line contains numbers X1, Y1, Z1;
the second line contains numbers X2, Y2, Z2.

All numbers are integers and greater than 0.

Output:
"Box 1 < Box 2", if the first box can be put inside the second box ;
"Box 1 > Box 2", if the second box can be put inside the first box;

otherwise, output "Incompatible".

Tip: One box can be placed inside the other only if it is strictly smaller by all three dimensions. It does not necessarily mean that boxes cannot have one equal side, as you can rotate them.

Sample Input 1:
1 2 3
5 6 4

Sample Output 1:
Box 1 < Box 2

Sample Input 2:
2 9 4
3 8 1

Sample Output 2:
Box 1 > Box 2

Sample Input 3:
1 3 7
2 8 3

Sample Output 3:
Incompatible
*/
import java.util.*;

class ArrayIteratingBoxes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Declare Box arrays
            int[] box1 = new int[3];
            int[] box2 = new int[3];

            // Fill array
            fillArray(box1, scanner);
            fillArray(box2, scanner);

            // Compare box arrays
            compareBoxArray(box1, box2);
        } // Scanner is automatically closed here, if an exception occurs
    }

    static void fillArray(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    static void compareBoxArray(int[] array1, int[] array2) {
        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare
        if ((array1[0] > array2[0]) &&
                array1[1] > array2[1] &&
                (array1[2] > array2[2])) {
            System.out.println("Box 1 > Box 2");
        } else if ((array1[0] < array2[0]) &&
                array1[1] < array2[1] &&
                (array1[2] < array2[2])) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}