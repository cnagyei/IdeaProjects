import java.util.Date;

class Person1 {

    protected String name;
    protected int yearOfBirth;
    protected String address;

    public Person1(String name, int yearOfBirth, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Constructor of a subclass will always call the default no-arg constructor of the superclass
class Employee1 extends Person1 {
    protected Date startDate;
    protected Long salary;

    public Employee1(String name, int yearOfBirth, String address, Date startDate, Long salary) {
        super(name, yearOfBirth, address); // invoking constructor of superclass

        this.startDate = startDate;
        this.salary = salary;
    }

    // getters and setters
}