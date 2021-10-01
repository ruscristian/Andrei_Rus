package tema.sci.oop_homework.phone_owner;

public class PhoneOwner {

    private String firstName;
    private String lastName;


    public PhoneOwner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    @Override
    public String toString() {
        return "PhoneOwner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
