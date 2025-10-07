class BrokenVariants {
    public static void main(String[] args) {
        CatFoo casper = new CatFoo("Casper", -1);

        System.out.println(casper.name);
        System.out.println(casper.age);
    }
}

class CatFoo {
    String name;
    int age;

    public CatFoo(String name, int age) {
        assert (age >= 0) : "Invalid age";
        this.name = name;
        this.age = age;
    }
}
