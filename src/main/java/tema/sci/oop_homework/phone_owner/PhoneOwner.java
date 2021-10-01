package tema.sci.oop_homework.phone_owner;

import tema.sci.oop_homework.phone.Phone;

public class PhoneOwner {

    private String firstName;
    private String lastName;
    private Phone phone;



    public PhoneOwner(String firstName, String lastName, Phone phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "PhoneOwner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                '}';
    }
}
