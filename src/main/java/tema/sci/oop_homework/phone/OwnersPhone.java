package tema.sci.oop_homework.phone;
import tema.sci.oop_homework.phone_owner.PhoneOwner;

import java.util.HashMap;

public class OwnersPhone extends Model {

    private String phoneNumber;
    private PhoneOwner name;
    private String imei;
    private HashMap<String, OwnersPhone> contactsList = new HashMap<>();



    public OwnersPhone(PhoneOwner name, String phoneNumber,String imei) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.imei = imei;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public HashMap<String, OwnersPhone> getContactsList() {
        return contactsList;
    }

    @Override
    public String toString() {
        return "OwnersPhone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name=" + name +
                ", imei='" + imei + '\'' +
                ", contactsList=" + contactsList +
                '}';
    }
}

