import java.util.*;

public class CollectionsEx {
    public static void main(String[] args) {

        List<String> emptyList = Collections.emptyList();
        Set<String> emptySet = Collections.emptySet();

        List<Integer> singletonList = Collections.singletonList(100);
        Set<String> singletonSet = Collections.singleton("hello");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(23);
        List<Integer> immutableList = Collections.unmodifiableList(numbers);
        numbers.add(39);
        // immutableList.add(42); // Cannot modify

        // A tricky example
        List<Integer> singleton = Collections.singletonList(1);

        Collections.sort(singleton); // No exception because it is a singleton. List.of(1) will fail
        Collections.shuffle(singleton); // No exception because it is a singleton. List.of(1) will fail
        Collections.sort(immutableList); // Throws exception because more than 1 member

        List<Integer> listOfIntegers = new ArrayList<>();
        //Collections.asLifoQueue(listOfIntegers); // Queue not List
    }
}
