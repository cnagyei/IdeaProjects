import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CharactersMap {
    public static void main(String[] args) {
        Map<Integer, String> characters = new HashMap<>(32);

        characters.put(1000, "Cinderella");
        characters.put(2000, "Bonzie");
        characters.put(3000, "Ama");
        characters.put(4000, "Kofi");
        characters.put(5000, "Nana");
        characters.put(6000, "Amos");
        characters.put(7000, "Theresah");
        characters.put(8000, "Yewura");
        characters.put(9000, "Achiaa");
        characters.put(10000, "Kofi Kay");
        characters.put(11000, "Nicol");
        characters.put(12000, "Magyisi");
        characters.put(13000, "Abenaa");
        characters.put(14000, "Sarpong");
        characters.put(15000, "Agyei");
        characters.put(16000, "Asung");
        characters.put(17000, "Rhoda");
        characters.put(18000, "Panin");
        characters.put(19000, "Asaase");
        //System.out.println("Cinderella".hashCode());

        Map<String, String> str = new HashMap<>(64, 0.8f);

        str.put("AaAaAa", "First");
        str.put("Nanan", "Second");
        str.put("BBBBBB", "Third");

        System.out.println(str.get("Nanan"));

        for (Map.Entry<String, String> entry : str.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + key.length());
            System.out.println(value + ": " + value.length());
        }

        System.out.println(str);
        str.remove("Nanan");
        System.out.println(str);;
    }
}
