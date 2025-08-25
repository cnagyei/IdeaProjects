class VehicleStart {

    // vehicle of your dream

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }
}

class EnjoyVehicleStart {

    public static void startVehicle() {
        // start your vehicle
        VehicleStart car = new VehicleStart();
        VehicleStart.Engine engine = car.new Engine();

        engine.start();

    }
}