    import java.util.Date;

    public class ObjectsDateCreated {
        public  static Date lastCreated;

        public ObjectsDateCreated() {
            this.lastCreated = new Date();
        }
    }

    class MainDateObject {
        public static void main(String[] args) throws InterruptedException {
            System.out.println(ObjectsDateCreated.lastCreated); // Prints the class static field with no value yet

            ObjectsDateCreated dateObject = new ObjectsDateCreated(); // Create class object. Invokes contructed
            System.out.println(ObjectsDateCreated.lastCreated); // Static field has value after constructor invoked

            System.out.println("Pausing for 2 seconds...");
            Thread.sleep(2000);

            ObjectsDateCreated instance = new ObjectsDateCreated(); // Invokes constructor with new date
            System.out.println(instance.lastCreated);

            System.out.println("Pausing for another 2 seconds...");
            Thread.sleep(2000);

            ObjectsDateCreated instance2 = new ObjectsDateCreated(); // Invokes constructor with new date
            System.out.println(instance2.lastCreated);
        }
    }