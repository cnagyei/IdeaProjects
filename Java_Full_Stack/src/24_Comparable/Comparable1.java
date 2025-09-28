import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(13);
        list.add(47);

        Collections.sort(list);
        System.out.println(list);

        List<CarMotor> cars = new ArrayList<>();
        CarMotor car1 = new CarMotor(2340, "Hyundai", "White", 2500);
        CarMotor car2 = new CarMotor(450, "Toyota", "Blue", 1500);
        CarMotor car3 = new CarMotor(940, "Volvo", "Yellow", 2750);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Collections.sort(cars);
        for (CarMotor car : cars) {
            System.out.println(car.getNumber());
        }

        System.out.println(car1.compareTo(car2));
        System.out.println(car1.compareTo(car3));
        System.out.println(car2.compareTo(car3));
    }
}

class CarMotor implements Comparable<CarMotor> {
    private int number;
    private String model;
    private String color;
    private int weight;

    public CarMotor(int number, String model, String color, int weight) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int compareTo(CarMotor carMotor) {
        int numberComparison = Integer.valueOf(getNumber()).compareTo(carMotor.getNumber());
        // return Integer.compare(getNumber(), carMotor.getNumber()); // Another way

        if (numberComparison != 0) {
            return numberComparison;
        }
        return model.compareTo(carMotor.model);

        /*
        model is a String object, so we use its built-in compareTo() method.
        number is an int primitive, so we use the static helper Integer.compare() to compare it.
         */
    }
}
