package tema.sci.oop_homework.phone_owner;

import tema.sci.oop_homework.phone.Phone;

public class PhoneOwner {

    private long phoneNumber;
    private Phone phone;

    @Override
    public String toString() {
        return "PhoneOwner{" +
                "phoneNumber=" + phoneNumber +
                ", phone=" + phone +
                '}';
    }

    public PhoneOwner(long phoneNumber, Phone phone) {
        this.phoneNumber = phoneNumber;
        this.phone = phone;
    }
}
