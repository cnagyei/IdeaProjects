/*
n Java, the static keyword on a class has a very specific meaning: it indicates a static nested class.
This is fundamentally different from how static is used for methods or variables.

What Is a Static Nested Class?
A static nested class is a class defined inside another class, but it behaves as a top-level class. The key distinction is that it doesn't need an instance of its outer class to be created. You can think of it as a separate, self-contained class that happens to be declared within another class for logical grouping or packaging.

Why Use a Static Nested Class?
You would use a static nested class for two main reasons:

Logical Grouping: To group a helper class with its outer class. For example, a Node class within a LinkedList class.
The Node is a fundamental part of the LinkedList's implementation, but it doesn't need access to the LinkedList's
instance-specific data. Declaring it as a static nested class keeps the code organized and readable.

Increased Encapsulation: To increase encapsulation by making the nested class private to its outer class,
preventing other classes from accessing it.

Key Characteristics of a Static Nested Class
No Implicit Outer Class Reference: A static nested class cannot directly access the non-static (instance) members of
its outer class. This is because it doesn't have an implicit reference to an instance of the outer class.

Can Be Instantiated Independently: You can create an instance of a static nested class using the outer class's name,
without first creating an object of the outer class.
For example, OuterClass.StaticNestedClass inner = new OuterClass.StaticNestedClass();.

Can Be Inherited and Inherit: A static nested class can extend another class and can also be extended by other classes,
as seen in your TeamLead and Programmer example. This is a crucial difference from a C# static class.

Can Contain Both Static and Instance Members: A static nested class can have its own static members and instance
members (fields, methods, and constructors) just like a regular top-level class.

In short, a static nested class in Java is a way to structure your code for logical grouping and encapsulation.
It does not make the class itself "static" in the C# sense of being a container for only static members. The static keyword in this context simply breaks the implicit link to the outer class instance.
 */

class TestPoly {
    public static void main(String[] args) {
        new TeamLead(1);
    }

    public static class TeamLead extends Programmer {
        private final int numTeamLead;

        public TeamLead(int numTeamLead) {
            super(numTeamLead);
            this.numTeamLead = numTeamLead;
            employ();
        }


        protected void employ() {
            System.out.println(numTeamLead + " teamlead");
        }
    }

    public static class Programmer {
        private final int numProgrammer;

        public Programmer(int numProgrammer) {
            this.numProgrammer = numProgrammer;
            employProgrammer(); // due to polymorphism, the subclass' employ() will be executed even though the parent's is call
        }

        protected void employProgrammer() {
            System.out.println(numProgrammer + " programmer");
        }
    }


}