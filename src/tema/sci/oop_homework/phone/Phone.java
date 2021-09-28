package tema.sci.oop_homework.phone;


import tema.sci.oop_homework.phone_owner.PhoneOwner;

import java.util.ArrayList;
import java.util.List;

public class Phone{

    private PhoneOwner phoneNumber;
    private int imei;
    private Brand brand;
    private List<Messages> messagesList = new ArrayList<>();
    private List<Contacts> contactsList = new ArrayList<>();


    public Phone() {
    }

    public Phone(PhoneOwner owner,Brand brand, int imei) {
        this.phoneNumber = owner;
        this.brand = brand;
        this.imei = imei;
    }


}

