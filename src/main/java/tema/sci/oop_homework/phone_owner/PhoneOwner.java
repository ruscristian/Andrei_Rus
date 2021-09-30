package tema.sci.oop_homework.phone_owner;

import tema.sci.oop_homework.phone.Phone;
import tema.sci.oop_homework.util.Generators;

public class PhoneOwner {

    private long phoneNumber;

    public long getPhoneNumber() {
        return phoneNumber;
    }

    private Phone phone;

    @Override
    public String toString() {
        return "PhoneOwner{" +
                "phoneNumber=" + phoneNumber +
                ", phone=" + phone +
                '}';
    }

    public PhoneOwner(Phone phone) {
        this.phoneNumber = Generators.getGeneratedLong();
        this.phone = phone;
    }
}
