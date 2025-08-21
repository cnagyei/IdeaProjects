/*
Getting the fullname
Here is the User class with two fields: firstName and lastName.
Implement two null-safety setters and one calculated getter in the following ways:
both setters should accept and set a value if it is not null or an empty string "";
the getter should return the full name of the user by concatenating firstName and lastName using a single
space between them. If one of the parts was not set, the getter should return only the other part without
additional spaces. If both parts are empty, the getter should return the word "Unknown".
There are two examples below:

User tim = new User();
tim.setFirstName("Tim");
tim.setLastName("Towler");
System.out.println(tim.getFullName()); // Tim Towler

User katie = new User();
katie.setFirstName("Katie");
katie.setLastName(null);
System.out.println(katie.getFullName()); // Katie (without additional spaces)
 */
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String fullName = "";
        if ((firstName != null && !firstName.isEmpty()) &&
                (lastName != null && !lastName.isEmpty())) {
            fullName = firstName.concat(" ").concat(lastName);
        } else if (firstName != null && !firstName.isEmpty()) {
            fullName = firstName;
        } else if (lastName != null && !lastName.isEmpty()) {
            fullName = lastName;
        } else {
            fullName = "Unknown";
        }

        return fullName;
    }
}

class userMain {
    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Kofi");
        tim.setLastName(null);
        System.out.println(tim.getFullName());
    }
}