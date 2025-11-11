import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        Iterable<String> iterable = List.of("one", "two", "three");

        iterable.forEach(System.out::println);

        Set<String> set = Set.of("one", "two", "three");
        set.forEach(System.out::println);

        Set<Long> set2 = new TreeSet<>();
        set2.add(10L);
        set2.add(5L);
        set2.add(18L);
        set2.add(14L);
        set2.add(9L);

        System.out.println(set2);

        Iterator<Long> iter = set2.iterator();
        while (iter.hasNext()) {
            Long nextValue = iter.next();
            if (nextValue < 10L) {
                iter.remove();
            }
        }
        System.out.println(set2);

        System.out.println("---------------------");

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListIterator<Integer> listIterator = list.listIterator();

        // Go to last element
        while (listIterator.hasNext()) {
            listIterator.next();
            System.out.println(listIterator.previousIndex());
        }

        // Print elements in backward order with their indexes
        while (listIterator.hasPrevious()) {
            int previousIndex = listIterator.previousIndex();
            int element = listIterator.previous();
            System.out.println(element + " on " + previousIndex);
        }
    }
}
