/*
Value or min
The Map interface has a standard method getOrDefault. It returns the value to which the specified key is mapped, or
defaultValue if this map contains no mapping for the key.
Let's implement a similar method getOrMin. It behaves in the same way if the specified key is present in a map,
but returns the minimum value otherwise.
For instance, we have a map with the entries A: 1, B: 2, C: 3
If we pass B, then 2 is expected
If we pass D, then 1 is expected

Sample Input 1:
3
A 1
B 2
C 3
B

Sample Output 1:
2
 */
import java.util.*;

class MainValueOrMin {
    private static int getOrMin(Map<String, Integer> map, String key) {
        // implement me
        Integer min = Collections.min(map.values());
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            return min;
        }
    }

    // do not change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> m = new HashMap<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; ++i) {
            String key = scanner.next();
            int value = scanner.nextInt();
            m.put(key, value);
        }
        String key = scanner.next();
        int result = getOrMin(Map.copyOf(m), key);
        System.out.println(result);
    }
}