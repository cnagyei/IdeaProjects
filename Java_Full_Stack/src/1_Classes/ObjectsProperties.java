class ObjectsProperties {
    String str = new String();  // new creates an object of a particular type.
                                // The variable str stores a reference to the object "hello" located somewhere in the heap memory.
}

class Patient {
    String name;
    int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class MainObject {
    public static void main(String[] args) {
        Patient patient = new Patient("John", 18);

        int number;
    }
}