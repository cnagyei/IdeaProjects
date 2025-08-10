import java.util.*;

class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

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

class Client extends Person {
    protected String contractNumber;
    protected boolean gold;

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }
}

class Employee extends Person {
    protected Date startDate;
    protected Long salary;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    protected boolean smile;

    public boolean isSmile() {
        return smile;
    }

    public void setSmile(boolean smile) {
        this.smile = smile;
    }
}

class Programmer extends Employee {
    protected String[] programmingLanguages;

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}

class PersonMain {
    public static void main(String[] args) {
//        Programmer p = new Programmer();
//
//        p.setName("Caleb Agyei");
//        p.setYearOfBirth(1990);
//        p.setAddress("4 Mallam CP, Gbawe, Accra");
//        p.setStartDate(new Date());
//        p.setSalary(1000_000_000L);
//        p.setProgrammingLanguages(new String[] {"Java", "Swift"});
//
//        System.out.println(p.getName());
//        System.out.println(p.getYearOfBirth());
//        System.out.println(p.getAddress());
//        System.out.println(p.getStartDate());
//        System.out.println(p.getSalary());
//        System.out.println(Arrays.toString(p.getProgrammingLanguages()));

        // Superclass reference
        Person person = new Programmer();
        person.name = "Nana"; // Can access only fields and methods in superclass, unless those fields and methods overriden by subclass


        // Casting
        Programmer newPerson = (Programmer) person;

        // After successfully casting a superclass to a subclass, we can access subclass-specific members.
        newPerson.yearOfBirth = 1990;
    }
}