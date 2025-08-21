/*
Static methods cannot be overridden. If a subclass has a static method with the same signature (name and parameters)
as a static method in the superclass then the method in the subclass hides the one in the superclass. It's completely
different from method overriding.
 */

class mainHidingStaticMethods {
    public static void main(String[] args) {

        HideStaticMethods.staticMethod(); // prints superClass
        new HideStaticMethods().staticMethod(); // prints superClass

        SubClassHideStaticMethods.staticMethod(); // prints subClass
        new SubClassHideStaticMethods().staticMethod(); // prints subClass

        HideStaticMethods ss = new SubClassHideStaticMethods();
        ss.staticMethod(); // prints superClass
    }
}

class HideStaticMethods {
    public static void staticMethod() {
        System.out.println("superClass");
    }

}

class SubClassHideStaticMethods extends HideStaticMethods {
    public static void staticMethod() {
        System.out.println("subClass");
    }
}