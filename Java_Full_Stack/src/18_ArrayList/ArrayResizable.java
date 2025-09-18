import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

public class ArrayResizable {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(50);

        System.out.println(list.size());

        list.add("Cup");
        list.add("Duck");
        list.add("Egg");

        System.out.println(list);

        list.add(0, "Calendar");
        System.out.println(list);

        list.set(1, "Chicken");
        System.out.println(list);

        System.out.println(list.size());
        System.out.println("Get: " + list.get(0));

        list.remove(0);
        System.out.println(list);

        //list.clear();
        //System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(50);
        list2.add("Goat");
        System.out.println(list2);

        list2.addAll(list);
        System.out.println(list2);

        list2.addAll(1, list);
        System.out.println(list2);

        System.out.println(list2.contains("Cup"));
        System.out.println(list2.contains("Duck"));
        System.out.println(list2.contains("Egg"));

        System.out.println(list2.indexOf("Cup"));
        System.out.println(list2.indexOf("Duck"));
        System.out.println(list2.lastIndexOf("Duck"));

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

        for (String name : nameList) {
            System.out.println(name);
        }


        var list3 = new ArrayList<Integer>();
        list3.add(5);
        list3.add(1);
        list3.add(3);
        list3.add(3);
        list3.add(1);
        list3.add(2);
        list3.add(5);

        System.out.println(list3.lastIndexOf(2));
        System.out.println(list3.indexOf(2));


        System.out.println("============");
        System.out.println(list3); // [5, 1, 3, 3, 1, 5]
        Collections.sort(list3);
        System.out.println(list3); // [1, 1, 3, 3, 5, 5]
        System.out.println(Collections.frequency(list3, 5)); // 2


//        int num = 5;
//        System.out.println(num == list3.getLast());
//
//        ArrayList<Integer> newList = new ArrayList<>();
//
//        // Handle edge cases
//        if (num > list3.getLast()) {
//            int frequency = Collections.frequency(list3, list3.getLast());
//            for (int i = 0; i < frequency; i++) {
//                newList.add(list3.getLast());
//            }
//        } else if (num < list3.getFirst()) {
//            int frequency = Collections.frequency(list3, list3.getFirst());
//            for (int i = 0; i < frequency; i++) {
//                newList.add(list3.getFirst());
//            }
//        }
//
//        // num in list
//        if (list3.contains(num)) {
//            if (num == list3.getLast()) {
//                int frequency;
//
//                // Moving left
//                int index = list3.indexOf(num);
//                System.out.println(index); // 4
//
//                frequency = Collections.frequency(list3, list3.get(index - 1));
//                for (int i = 0; i < frequency; i++) {
//                    newList.add(list3.get(index - 1));
//                }
//            } else if (num == list3.getFirst()) {
//                int index = list3.lastIndexOf(num);
//                int frequency = Collections.frequency(list3, list3.get(index + 1));
//                for (int i = 0; i < frequency; i++) {
//                    newList.add(list3.get(index - 1));
//                }
//            }
//        }
//        System.out.println(newList);
    }
}
