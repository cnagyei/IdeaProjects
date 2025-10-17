import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> products = new HashMap<>();

        System.out.println(products);

        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Tablet");

        System.out.println(products);

        System.out.println(products.get(1000));
        System.out.println(products.get(2000));
        products.remove(2000);
        System.out.println(products.get(2000));

        products.putIfAbsent(5000, "Camera");
        System.out.println(products);
    }
}
