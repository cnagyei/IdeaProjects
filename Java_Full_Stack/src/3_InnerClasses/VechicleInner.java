class VehicleOuter {

    private String name;

    // create constructor
    public VehicleOuter(String name) {
        this.name = name;
    }


    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

    }

    // create class Body
    class Body {
        String color;

        public Body(String color) {
            this.color = color;
        }

        public void printColor() {
            System.out.println("Vehicle " + VehicleOuter.this.name + " has " + color + " body.");
        }
    }

}

// this code should work
class EnjoyVehicle {

    public static void main(String[] args) {

        VehicleOuter vehicle = new VehicleOuter("Dixi");
        VehicleOuter.Body body = vehicle.new Body("red");
        body.printColor();
    }
}