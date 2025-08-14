class Mammal {
    protected String sayHello() {
        return "ohlalalalalalaoooo";
    }
}

class Cat extends Mammal {

    @Override
    protected String sayHello() {
        return "Meow";
    }
}

class HumanBeing extends Mammal {

    @Override
    protected String sayHello() {
        return super.sayHello(); // Invoke baseclass method using super
    }
}

class MainMammal {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        System.out.println(mammal.sayHello());;

        Cat cat = new Cat();
        System.out.println(cat.sayHello());

        HumanBeing humanBeing = new HumanBeing();
        System.out.println(humanBeing.sayHello());
    }
}