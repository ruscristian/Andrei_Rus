package tema.sci.oop_homework.phone;


import java.util.*;

public class OwnersPhone extends Model {

    private String phoneNumber;
    private Model name;
    private String imei;


    private Map<String, Contact> contactsList = new HashMap<>();
    private List<Call> callHistory = new LinkedList<>();
    private List<Message> messageHistory = new LinkedList<>();



    public OwnersPhone(Model name, String phoneNumber,String imei) {
        super();
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.imei = imei;
    }

    public Collection<Contact> getContactsList() { return contactsList.values(); }


    public void addContact(String phoneNumber, String firstName, String lastName){
      this.contactsList.put(phoneNumber, new Contact(phoneNumber, firstName, lastName));
    }


    public void call(String phoneNumber) {
        Contact toCall = contactsList.get(phoneNumber);
        if (toCall == null) {
            addContact(phoneNumber, "Unknown", "Unknown");
            toCall = contactsList.get(phoneNumber);
        }
        callHistory.add(new Call(toCall, System.currentTimeMillis()));
        this.setBattery(-2);
    }


    public void viewHistory(){
        System.out.println(callHistory);
    }

    public void sendMessage(String phoneNumber, StringBuilder message) {
        Contact toMessage = contactsList.get(phoneNumber);
        if (toMessage == null) {
            addContact(phoneNumber, "Unknown", "Unknown");
            toMessage = contactsList.get(phoneNumber);
        }

        message = new StringBuilder();
        message.setLength(100);
        messageHistory.add(new Message(toMessage, message , System.currentTimeMillis()));
        this.setBattery(-1);
    }

    public void viewMessageHistory(){
        System.out.println(messageHistory);
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

