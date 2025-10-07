import java.util.Scanner;

class Util {
    public static int[] swapInts(int[] ints) {
        return new int[]{ints[1], ints[0]};
    }
}

class MainSwapDebug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());

        System.out.println(Util.swapInts(ints)[0]);
        System.out.println(Util.swapInts(ints)[1]);


//        System.out.println(newInts[0]);
//        System.out.println(newInts[1]);
    }
}

class Animal {
    private String name;

    Animal(String name) {
        assert (name != null) : "Name must not be null";
        this.name = name;
    }
}