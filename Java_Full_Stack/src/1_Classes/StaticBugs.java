class Test {

    public static final String DEFAULT_APPLICATION_NAME = "MyDemoApp";
    public static final int MAX_IMAGE_SIZE_KB = 4096;

    public static String hello = "Hello"; // (1)

    public static void main(String args[]) {

        /*
        In the main method, which is also static, you are trying to print the value of a static variable.
        Since both the main method and DEFAULT_APPLICATION_NAME are part of the Test class, you can refer to
        DEFAULT_APPLICATION_NAME directly without explicitly writing Test.DEFAULT_APPLICATION_NAME.
        The compiler implicitly knows you're referring to the static variable of the current class.
         */
        System.out.println(DEFAULT_APPLICATION_NAME); // (2)

        //MAX_IMAGE_SIZE_KB = 2048; // (3)

        //printHello(); // (4)
    }

    private void printHello() {
        System.out.println(hello); // (5)
    }
}