import javax.print.attribute.HashAttributeSet;
import java.util.Map;
import java.util.Set;

public class MainMap {
    public static void main(String[] args) {
        Map<String, String> emptyMap = Map.of(); // Immutable
        System.out.println(emptyMap);

        Map<String, String> friendPhones = Map.of(
                "Bertha", "024-406-8063",
                "Caleb", "024-627-5666"
        );
        System.out.println(friendPhones);

        System.out.println(emptyMap.size());
        System.out.println(friendPhones.size());

        System.out.println(friendPhones.get("Caleb"));
        System.out.println(friendPhones.get("Bertha"));
        System.out.println(friendPhones.get("Alice"));

        System.out.println(friendPhones.getOrDefault("Kofi", "Lalala"));

        System.out.println(friendPhones.containsKey("Kofi"));
        System.out.println(friendPhones.containsKey("Caleb"));

        System.out.println(friendPhones.containsValue("Kofi"));
        System.out.println(friendPhones.containsValue("024-406-8063"));

        System.out.println(friendPhones.keySet());
        System.out.println(friendPhones.values());

        Set<String> keys = friendPhones.keySet();
        keys.forEach(System.out::println);
    }
}
