/* Multiple Constructors
 * Bear in mind that you cannot define two constructors with the same number, types, and order of parameters!
 * Remember, the statement for invoking a constructor should be the first statement in the body of a caller
 * constructor
 */
class Robot3 {
    String name;
    String model;
    int lifetime;

    // No-argument constructor that initializes Robot2 with default values
    public Robot3() {
        this.name = "Anonymous";
        this.model = "Anonymous";
        System.out.println("No-arg constructor invoked");
    }

    // Takes one parameter and assigns it
    public Robot3(String name) {
        this(name, "Latest"); // This line invokes the 2-arg constructor and runs it to completion
                                    // Afterward, control returns to this 1-arg constructor
        System.out.println("1-arg constructor invoked");
    }
    // Invokes the 3-arg parameter and assigns the two from this constructor and lifetime to 20
    public Robot3(String name, String model) {
        this(name, model, 20); // This line calls a constructor with 3 args. Afterward, hand over control to 2-arg
        System.out.println("2-arg constructor invoked");
    }

    // Takes 3 parameters and assigns them
    public Robot3(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
        System.out.println("3-arg constructor invoked");
    }
}

class mainRobot3 {
    public static void main(String[] args) {
        // Use either constructor to create an instance of Robot2
        System.out.println("+++ First Robot call +++");
        Robot3 anonymous = new Robot3();

        System.out.println();
        System.out.println("+++ Second Robot call +++");
        Robot3 bertha = new Robot3("Cal_Robot");

        System.out.println();
        System.out.println("+++ Third Robot call +++");
        Robot3 abenaa = new Robot3("Cal_Robot", "Model_1");

        System.out.println();
        System.out.println("+++ Fourth Robot call +++");
        Robot3 kwami = new Robot3("Cal_Robot", "Model_1", 10);
    }
}