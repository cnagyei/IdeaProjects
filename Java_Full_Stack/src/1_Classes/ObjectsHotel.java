class Hotel {
    String name;
    String address;
    int rating;
    public static int staticIntField = 100;
}

class MainHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        Hotel h2 = new Hotel();
        Hotel h3 = h2;

        h2.name = "Caleb";
        h2.rating = 5;

        System.out.println(h3.name);
        System.out.println(h3.rating);

        h3.name = "John";
        h3.rating = 7;
        System.out.println(h2.name);
        System.out.println(h2.rating);
        System.out.println("========");
        System.out.println(h2.name);
        System.out.println(h2.rating);
        System.out.println(h3.name);
        System.out.println(h3.rating);

        Object o = new Object();
        if (o.equals(null)) {
            System.out.println("Object is null");
        }

        Hotel.staticIntField = 40;
        System.out.println(h1.staticIntField);

    }
}