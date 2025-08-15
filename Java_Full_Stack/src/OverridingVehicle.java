/*
Vroom vroom: A tale of two wheels

Hey there! This problem might be a bit unpredictable, but give it a go and let us know how you do!

Create a Vehicle hierarchy with a base Vehicle class and two subclasses: Car and Motorcycle.
Implement a method getInfo() in the Vehicle class that returns a string with vehicle type and speed.
Override getInfo() in subclasses to include additional information (number of doors for Car, has_sidecar for Motorcycle).
The program should take a single integer input representing the speed and output the getInfo() result for both a Car
and a Motorcycle instance with that speed.
Sample Input 1:
60

Sample Output 1:
Car: Speed 60 mph, Doors: 4
Motorcycle: Speed 60 mph, Sidecar: false

Sample Input 2:
80

Sample Output 2:
Car: Speed 80 mph, Doors: 4
Motorcycle: Speed 80 mph, Sidecar: false
 */
import java.util.Scanner;

class MainVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        scanner.close();

        Vehicle car = new Car(speed);
        Vehicle motorcycle = new Motorcycle(speed);

        System.out.println(car.getInfo());
        System.out.println(motorcycle.getInfo());
    }
}

class Vehicle {
    protected int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public String getInfo() {
        return "";
    }
}

class Car extends Vehicle {
    protected int doors;

    public Car(int speed) {
        super(speed);
    }

    public String getInfo() {
        doors = 4;
        return "Car: Speed " + speed + " mph, Doors: " + doors;
    }
}

class Motorcycle extends Vehicle {
    protected boolean sideCar;

    public Motorcycle(int speed) {
        super(speed);
    }

    public String getInfo() {
        sideCar = false;
        return "Motorcycle: Speed " + speed + " mph, Sidecar: " + sideCar;
    }
}