/* Multiple Constructors
 * Bear in mind that you cannot define two constructors with the same number, types, and order of parameters!
 * Remember, the statement for invoking a constructor should be the first statement in the body of a caller
 * constructor
 */
class Robot2 {
    String name;
    String model;

    // No-argument constructor that initializes Robot2 with default values
    public Robot2() {
        this.name = "Anonymous";
        this.model = "Anonymous";
    }

    // Takes two parameters and assign them.
    public Robot2(String name, String model) {
        this.name = name;
        this.model = model;
    }
}

class mainRobot2 {
    public static void main(String[] args) {
        // Use either constructor to create an instance of Robot2
        Robot2 anonymous = new Robot2();
        Robot2 andrew = new Robot2("Andrew", "NDR-114");
    }
}