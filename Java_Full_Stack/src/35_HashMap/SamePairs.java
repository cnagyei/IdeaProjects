import java.util.*;

class SamePairs {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.putIfAbsent("Germany", "Berlin");
        map1.putIfAbsent("Ivory Coast", "Abidjan");
        map1.putIfAbsent("Whens", "Space");
        System.out.println(map1);

        map2.putIfAbsent("Kofi", "Ama");
        map2.putIfAbsent("Whens", "Space");
        System.out.println(map2);

        map1.entrySet().retainAll(map2.entrySet());
        System.out.println(map1);
    }
}