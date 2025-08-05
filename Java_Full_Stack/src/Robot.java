import javax.sound.midi.Soundbank;

class Robot {
    int x, y;

    public void printCurrentPosition() {
        System.out.println("x: " + this.x);
        System.out.println("y: " + this.y);
    }

    public void moveRight(int steps) {
        x += steps;
    }

    public void moveUp(int steps) {
        y += steps;
    }

    public void moveDown(int steps) {
        y -= steps;
        if (y < 0) {
            y = 0;
        }
    }

    public void moveleft(int steps) {
        x -= steps;
        if (x < 0) {
            x = 0;
        }
    }
}

class RobotClass {
    public static void main(String[] args) {
        // Create a new Robot instance
        Robot ben = new Robot();

        // Move Robot
        ben.moveRight(3);
        ben.moveUp(2);
        ben.moveleft(4);
        ben.moveUp(2);
        ben.moveRight(1);

        // Print current position
        ben.printCurrentPosition();
    }
}