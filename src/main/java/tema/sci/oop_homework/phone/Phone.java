package tema.sci.oop_homework.phone;



import java.util.HashMap;

public class Phone{

    private Model model;
    private String imei;
    private Brand brand;
    private String phoneNumber;
    private HashMap<String, Phone> contactsList = new HashMap<>();


    public Phone(String phoneNumber, Brand brand, Model model, String imei) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
        this.model = model;
        this.imei = imei;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public HashMap<String, Phone> getContactsList() {
        return contactsList;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                " model='" + model + '\'' +
                ", imei='" + imei + '\'' +
                ", brand=" + brand +
                ", contactsList=" + contactsList +
                '}';
    }
}

