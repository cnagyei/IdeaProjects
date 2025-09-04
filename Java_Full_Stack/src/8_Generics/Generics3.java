import java.util.Scanner;

class MainMyHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create instance objects for mySelf and myChurch classes
        MySelf mySelf = new MySelf("Caleb", 34);
        MyChurch myChurch = new MyChurch("POP SDA", "Gbawe");

        // Generic class constructor takes String, mySelf class and myChurch class
        var myHistory = new MyHistory<>("House of Agyei", mySelf, myChurch);

        System.out.println(myHistory.getTitle());
        System.out.println(myHistory.getMySelf().getName());
        System.out.println(myHistory.getMySelf().getAge());
        System.out.println(myHistory.getMyChurch().getName());
        System.out.println(myHistory.getMyChurch().getLocation());

        System.out.println("Enter your new name below:");
        myHistory.getMySelf().setName(sc.nextLine());
        System.out.println("Your name has been changed to: " + myHistory.getMySelf().getName());

        System.out.println("Your new history profile is as follows:");
        System.out.println(myHistory.getMySelf().getName());
        System.out.println(myHistory.getMySelf().getAge());
        System.out.println(myHistory.getMyChurch().getName());
        System.out.println(myHistory.getMyChurch().getLocation());
    }
}


// MyHistory generic class
class MyHistory<T, S, U> {
    private T title;
    private S mySelf;
    private U myChurch;

    public MyHistory(T title, S mySelf, U myChurch) {
        this.title = title;
        this.mySelf = mySelf;
        this.myChurch = myChurch;
    }

    public T getTitle() {
        return title;
    }

    public S getMySelf() {
        return mySelf;
    }

    public U getMyChurch() {
        return myChurch;
    }

    public void setTitle(T title) {
        this.title = title;
    }

    public void setMySelf(S mySelf) {
        this.mySelf = mySelf;
    }

    public void setMyChurch(U myChurch) {
        this.myChurch = myChurch;
    }

}

// MyChurch class
class MyChurch {
    private String name;
    private String location;

    public MyChurch(String name, String location) {
        this.name = name;
        this.location = location;
    }


    public  String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}

// MySelf class
class MySelf {
    private String name;
    private int age;

    public MySelf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}