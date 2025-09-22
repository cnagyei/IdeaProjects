/*
Strict superset

In this problem, you need to implement a math operation that checks whether the second set is a strict superset of
the first set.

It means, the second set should contain all elements of the first set, but the sets must not be equal.

Sample Input 1:
1 2 3
4 1 2 3

Sample Output 1:
true

Sample Input 2:
b a c
e c d b

Sample Output 2:
false

Sample Input 3:
a b c
c b a

Sample Output 3:
false
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

class MainSuperSet {

    private static <T> boolean isStrictSuperset(Set<T> set1, Set<T> set2) {
        boolean result = false;
        int count = 0;
        if (set1.size() >= set2.size()) {
            return result;
        }
        for (T element : set1) {
            if (set2.contains(element)) {
                count++;
            }
        }
        result = count == set1.size();
        return result;
    }

    /* Please do not change the code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set1 = readStringSet(scanner);
        Set<String> set2 = readStringSet(scanner);

        System.out.println(isStrictSuperset(set1, set2));
    }

    private static Set<String> readStringSet(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toSet());
    }
}