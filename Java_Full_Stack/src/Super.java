class SuperClass {
    protected int field;

    public int getField() {
        return field;
    }

    protected void printBaseValue() {
        System.out.println(field);
    }
}

class SubClass extends SuperClass {
    protected int field;

    public SubClass() {
        this.field = 30; // Initialize field of SubClass
        field = 30; // Initializes field of SubClass
        super.field = 20; // Initialize field of SuperClass
    }

    public void printSubValue() {
        super.printBaseValue(); // Invokes SuperClass method. 'super' is optional here because member name is unique
        System.out.println(field); // Prints subClass value
    }
}

class mainSuperClass {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();

        System.out.println(subClass.field);
        subClass.printSubValue(); // instance calls parent method which accesses the value of field

        subClass.printSubValue(); // Calls instance method which executes similarly to the previous two lines

        // System.out.println(subClass.toString());
    }
}