class VehicleImprove {

    private String name;

    // create constructor
    public VehicleImprove(String name) {
        this.name = name;
    }

    class Engine {

        // add field horsePower
        int horsePower;

        // create constructor
        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

        // create method printHorsePower()
        public void printHorsePower() {
            System.out.println("Vehicle " + VehicleImprove.this.name + " has " + horsePower + " horsepower.");
        }
    }
}

// this code should work
class EnjoyVehicle1 {

    public static void main(String[] args) {

        VehicleImprove vehicle = new VehicleImprove("Dixi");
        VehicleImprove.Engine engine = vehicle.new Engine(20);
        engine.printHorsePower();
    }
}