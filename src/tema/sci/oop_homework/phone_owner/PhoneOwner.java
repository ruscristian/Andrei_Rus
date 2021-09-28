package tema.sci.oop_homework.phone_owner;

import tema.sci.oop_homework.phone.Phone;

public class PhoneOwner {

    private long phoneNumber;
    private String name;
    private Phone myPhone;

    public PhoneOwner(long phoneNumber, String name, Phone myPhone) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.myPhone = myPhone;
    }
}
