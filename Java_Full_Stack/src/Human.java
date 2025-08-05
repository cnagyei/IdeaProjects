public class Human {
    String name;
    int age;
    static String bestFood;

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void work() {
        System.out.println(this.name + " loves working!");
    }

    public void workTogetherWith (Human other) {
        System.out.println(this.name + " loves working with " + other.name);
    }
}

class MainClass {
    public static void main(String[] args) {
        // Static method available
        Human.averageWorking(); // An average human works 40 hours per week.

        // Create new Human Peter
        Human peter = new Human();
        peter.name = "Peter";
        peter.age = 24;
        Human.bestFood = "Fufu";
        peter.work();

        // Create new Human Alice
        Human alice = new Human();
        alice.name = "Alice";
        alice.age = 30;
        alice.work();

        peter.workTogetherWith(alice);
        alice.workTogetherWith(peter);
        System.out.printf(Human.bestFood);

    }
}

