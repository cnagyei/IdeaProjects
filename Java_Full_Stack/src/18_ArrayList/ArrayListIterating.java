import java.util.ArrayList;

public class ArrayListIterating {
    public static void main(String[] args) {

        var list = new ArrayList<Long>();

        int counter = 5;

        for (int i = 0; i < counter; i++) {
            long power = (long) Math.pow(10, i);
            list.add(power);
        }

        for (long element : list) {
            System.out.println(element);
        }

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('a');
        characters.add('b');
        characters.add(1, 'c');
        characters.add(1, 'd');
        characters.add('e');
        characters.add(5, 'f');

        System.out.println(characters);
    }
}
