package tema.sci.oop_homework.phone;



import tema.sci.oop_homework.util.Generators;

import java.util.HashMap;

public class Phone implements Messages{

    private String model;
    private long imei;
    private Brand brand;
    private HashMap<Long, String> contactsList = new HashMap<>();

    public Phone() {
    }

    public Phone(Brand brand, String model) {

        this.brand = brand;
        this.model = model;
        this.imei = Generators.getGeneratedLong();
    }

    public HashMap<Long, String> getContactsList() {
        return contactsList;
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


}

