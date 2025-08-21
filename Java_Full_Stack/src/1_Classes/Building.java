public class Building {
    private String name;
    private String type;
    private String location;
    private int age;
    private int numberOfRooms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location != null) {
            this.location = location;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRooms() {
        return numberOfRooms;
    }

    public void setRooms(int rooms) {
        this.numberOfRooms = rooms;
    }

    public static void printLocations(Building[] buildings) {
        for (Building building : buildings) {
            System.out.println(building.getName() + " is located at " + building.getLocation());
        }
    }
}

class ChamberAndHall extends Building {
    private boolean hasStore;

    public boolean isHasStore() {
        return hasStore;
    }

    public void setHasStore(boolean hasStore) {
        this.hasStore = hasStore;
    }
}

class Story extends Building {
    private int numberOfStories;

    public int getNumberOfStories() {
        return numberOfStories;
    }

    public void setNumberOfStories(int numberOfStories) {
        this.numberOfStories = numberOfStories;
    }
}

class buildingMain {
    public static void main(String[] args) {

        // Superclass reference
        Building chamber = new ChamberAndHall();
        chamber.setName("Chamber and Hall");
        chamber.setLocation("Gbawe");

        // Subclass reference
        Story story = new Story();
        story.setName("Abrosan");
        story.setLocation("Awoshie");

        // Superclass object
        Building house = new Building();
        house.setName("Nana House");
        house.setLocation("Mallam");

        // Subclass object
        ChamberAndHall oneBed = new ChamberAndHall();
        oneBed.setName("Zero House");
        oneBed.setLocation("Zero");

        // Print locations
        Building[] buildings = {chamber, story, house, oneBed};
        System.out.println(oneBed.getLocation());

        Building.printLocations(buildings);
    }
}