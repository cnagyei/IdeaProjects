import java.util.ArrayList;
import java.util.Collection;

class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.size());

        list.add("first");
        list.add("second");
        list.add("third");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.remove("third"));
        System.out.println(list.remove(0));
        System.out.println(list);

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.size());

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("===========");
        numbers.forEach(System.out::println);

        System.out.println("===========");
        numbers.forEach(element -> System.out.println(element));
    }
}