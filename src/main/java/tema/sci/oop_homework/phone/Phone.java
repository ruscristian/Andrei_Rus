package tema.sci.oop_homework.phone;


import tema.sci.oop_homework.phone_owner.PhoneOwner;

import java.util.ArrayList;
import java.util.List;

public class Phone{

    private String model;
    private long imei;
    private Brand brand;
    private List<Contacts> contactsList = new ArrayList<>();


    public Phone(Brand brand, String model, long imei) {

        this.brand = brand;
        this.model = model;
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", imei=" + imei +
                ", brand=" + brand +
                ", contactsList=" + contactsList +
                '}';
    }

    public Phone() {
    }
}

