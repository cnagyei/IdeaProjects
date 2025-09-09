class MainDefaultMethods {
    public static void main(String[] args) {
        // Default methods can be accessed through a class that implements the interface
        DefaultMethods defaultMethods = new MyClass();
        defaultMethods.printDefaultMethod(); // Default methods can be accessed without having to change implementation in class
        defaultMethods.printHelloWorld(); // Abstract method must be implemented in class before being accessed
    }

}

interface DefaultMethods {
    // Abstract methods have no implementation
    void printHelloWorld();

    // Default methods have implementation
    default void printDefaultMethod() {
        System.out.println("I'm a default method.\nI have a body");
    }
}

class MyClass  implements DefaultMethods {
    @Override
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    // Default method can be overridden
    @Override
    public void printDefaultMethod() {
        System.out.println("I have a nice body");
    }
}