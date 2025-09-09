interface Movable {
    void stepAhead();
    void turnLeft();
    void turnRight();

    default void turnAround() {
        turnLeft();
        turnLeft();
    }
}

interface Jumpable {
    void jump();
    void turnLeftJump();
    void turnRightJump();

    default void turnAround() {
        turnLeftJump();
        turnRightJump();
    }
}

class Spiderman implements Movable, Jumpable {
    // Define implementation for abstract methods
    // From Movable
    @Override
    public void stepAhead() {
        System.out.println("Stepping ahead");
    };
    public void turnLeft() {
        System.out.println("Turning left");
    };
    public void turnRight() {
        System.out.println("Turning right");
    }

    // From Jumpable
    public void jump() {
        System.out.println("Jumping");
    }
    public void turnLeftJump() {
        System.out.println("Jumping left");
    }
    public void turnRightJump() {
        System.out.println("Jumping right");
    }

    // Two ways to deal with the Diamond problem - two default methods with the same signature
//    // 1. Define your own implementation
//    @Override
//    public void turnAround() {
//        turnLeftJump();
//        turnRight();
//    }

    // 2. Choose one or both using super keyword
    public void turnAround() {
        Movable.super.turnAround();
        Jumpable.super.turnAround();
    }
}
