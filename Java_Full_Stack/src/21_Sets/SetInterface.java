import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = Set.of();
        System.out.println(set); // Empty set

        Set<String> people = Set.of("Kwame", "Kofi", "Rhoda");
        System.out.println(people);

        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);
        System.out.println(numbers);

        System.out.println(set.contains(0));
        System.out.println(people.contains("Caleb"));
        System.out.println(numbers.contains(20));

        // HashSet
        Set<String> countries = new HashSet<>();
        countries.add("Korea");
        countries.add("Ghana");
        countries.add("South Africa");
        countries.add("Germany");
        countries.add("Russia");
        System.out.println(countries);

        // SortedSet
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(14);
        sortedSet.add(5);
        sortedSet.add(10);
        sortedSet.add(15);
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.headSet(10));
        System.out.println(sortedSet.tailSet(10));

        Set<Character> characters = new LinkedHashSet<>();
        for (char ch = 'a'; ch <= 'k'; ch++) {
            characters.add(ch);
        }
        System.out.println(characters);

        // Set Operations
        // Getting a mutable set from an immutable one
        Set<String> nations = new HashSet<>(List.of("Kenya", "Argentina", "Canada", "Angola"));
        System.out.println(nations);

        nations.addAll(List.of("Morocco", "Latvia", "Switzerland", "Canada")); // Union
        System.out.println(nations);

        nations.retainAll(List.of("Burkina Faso", "Morocco", "Switzerland")); // Intersection
        System.out.println(nations);

        nations.removeAll(List.of("Morocco")); // Difference
        System.out.println(nations);

        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String name : nameSet) {
            System.out.println(name);
        }


        SortedSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(3);

        Set<Integer> set2 = Set.of(3, 1);
        System.out.println(set1.equals(set2));
    }
}
