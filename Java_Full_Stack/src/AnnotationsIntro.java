class mainAnnotations {
    public static void main(String[] args) {

    }

    @Deprecated
    public void oldMethod() {

    }

    @SuppressWarnings("unused")
    public void printHello() {
        System.out.println("Hello!");
    }

    @Deprecated(since = "5.3", forRemoval = true) // false is default for forRemoval
    public void overrideSuperclass() {
        System.out.println("Override");
    }
}