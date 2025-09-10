/*
Blacklist

Has it ever bothered you when unknown people call you and try to impose their services? That can be annoying.

Let's try to solve the problem by using a blacklist. You should implement the filterPhones method that returns only
the phone numbers that are not on the blacklist.

Tip: Choose appropriate method(s) of the Collection interface to solve this task.

Sample Input 1:
387-968-2999 505-468-5235 739-738-3272
505-468-5235

Sample Output 1:
387-968-2999 739-738-3272
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        // write your code here
        for (String phone : blacklist) {
            phones.remove(phone);
        }
        return phones;
    }
}

/* Please, do not modify this I/O code */
class MainBlacklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = CollectionUtils.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}