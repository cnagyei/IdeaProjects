import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListUtils2 {

    /**
     * It splits the passed list into a sequence of sublists with a predefined size 
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();
        List<T> sublist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            sublist.add(list.get(i));
            System.out.println("Adding: " + list.get(i));
            System.out.println(sublist);

            if (sublist.size() == subListSize || i == list.size() - 1) {
                sublists.add(sublist);
                System.out.println("Sublists: " + sublists);
                sublist =  new ArrayList<>();
                System.out.println("Sublist reset: " + sublist);
                System.out.println(sublists);

            }
        }

        return sublists;
    }
}

/* Please, do not modify code in this class */
class MainSublists2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

//        final String[] values = scanner.nextLine().split("\\s+");
//
//        final List<Integer> list = Arrays.asList(values).stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
        final List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = ListUtils2.splitListIntoSubLists(list, subListSize);
        System.out.println(subLists);

//        subLists.forEach(subList -> {
//            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
//            System.out.println(representation);
//        });
    }
}