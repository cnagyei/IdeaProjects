/*
Ternary predicate

Write your own functional interface called TernaryIntPredicate and use it with a lambda expression.
The interface must have a single non-static (and non-default) method called test that accepts three int
arguments and returns a boolean value.

Also, write a lambda expression of the TernaryIntPredicate type with three int arguments.
The lambda expression should return true if all passed values are different, otherwise it should return false.
The expression should be assigned to a static field named ALL_DIFFERENT.

There is a template to be used for your solution. Please, do not change it.
Sample Input 1:
1 1 1

Sample Output 1:
False

Sample Input 2:
2 3 4

Sample Output 2:
True
 */
class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (a, b, c) -> a != b && b != c && a != c;

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int a, int b, int c);
    }
}

class MainPredicate {
    public static void main(String[] args) {
        System.out.println(Predicate.ALL_DIFFERENT.test(1, 1, 1));
    }
}