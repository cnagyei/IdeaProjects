import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ListsInterface {
    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c", "d", "e", "f");
        List<Double> amount = List.of(20.0, 5000.4, 29283.2);
        List<Integer> number =  List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> daysOfWeek = List.of(
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        );

        System.out.println(daysOfWeek.get(5));
        System.out.println(amount.size());
        System.out.println(number.subList(1, 5));

        //number.add(4); // Immutable - Throws UnsupportedOperationException

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(Objects.equals(list1, list2));

        List<String> names = List.of("Kofi", "Ama", "Abenaa");
        List<String> names2 = new LinkedList<>();
        names2.add("Kofi");
        names2.add("Ama");
        names2.add("Abena");
        System.out.println(names);
        System.out.println(names2);
        System.out.println(Objects.equals(names, names2));

        // names.set(0, "Caleb"); // throws UnsupportedOperationException
        System.out.println(names);
    }
}
