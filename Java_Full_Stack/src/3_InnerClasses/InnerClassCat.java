
class MainCat2 {
    public static void main(String[] args) {

        // Create cat Bob
        Cat2 catBob = new Cat2("Bob"); // To use inner classes, first create an instance of the outer class
        Cat2.Bow bowBob = catBob.new Bow("red"); // Create an instance of the inner class

        bowBob.printColor();

        // Create cat Princess
        Cat2 catPrincess = new Cat2("Princess");
        Cat2.Bow bowPrincess = catPrincess.new Bow("golden");

        bowPrincess.printColor();
        bowPrincess.putOnABow();
    }
}

class Cat2 {

    private String name;

    public Cat2(String name) {
        this.name = name;
    }

    private void sayMeow() {
        System.out.println(this.name + " says: \"Meow\".");
    }

    public class Bow {
        private String color;

        public Bow(String color) {
            this.color = color;
        }

        public void putOnABow() {
            Cat2.this.sayMeow();
            System.out.println("Bow is on!");
        }

        public void printColor() {
            System.out.println("Cat " + Cat2.this.name + " has a " + this.color + " bow.");
        }
    }
}