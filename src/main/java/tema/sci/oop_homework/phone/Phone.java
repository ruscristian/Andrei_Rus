package tema.sci.oop_homework.phone;


import java.util.*;

public class Phone extends Model {

    private String phoneNumber;
    private String imei;


    private Map<String, Contact> contactsList = new HashMap<>();
    private List<Call> callHistory = new LinkedList<>();
    private Map<String, List<Message>> messageHistory = new HashMap<>();



    public Phone(Model name, String phoneNumber, String imei) {
        super(name.getBrand(), name.getColor(), name.getMaterial(), name.getBattery());
        this.phoneNumber = phoneNumber;
        this.imei = imei;
    }

    public Collection<Contact> getContactsList() { return contactsList.values(); }


    public void addContact(String phoneNumber, String firstName, String lastName){
      this.contactsList.put(phoneNumber, new Contact(phoneNumber, firstName, lastName));
    }

    public void drainBattery(int howMuch){
        if (this.getBattery()-howMuch < 0){
            System.out.println("Not enough battery");
        }

        else {this.setBattery(this.getBattery() - howMuch);}
    }


    public void call(String phoneNumber) {
        Contact toCall = contactsList.get(phoneNumber);
        if (toCall == null) {
            addContact(phoneNumber, "Unknown", "Unknown");
            toCall = contactsList.get(phoneNumber);
        }
        callHistory.add(new Call(toCall, System.currentTimeMillis()));
        drainBattery(2);
    }
    public void viewHistory(){
        System.out.println(callHistory);
    }



    public void sendMessage(String phoneNumber, String message) {
        Contact toMessage = contactsList.get(phoneNumber);
        if (toMessage == null) {
            addContact(phoneNumber, "Unknown", "Unknown");
            toMessage = contactsList.get(phoneNumber);
        }

        if (messageHistory.get(phoneNumber) == null){
            messageHistory.put(phoneNumber, new LinkedList<Message>());
        }
        messageHistory.get(phoneNumber).add( new Message(toMessage,
                                                        new StringBuilder(message), System.currentTimeMillis()));
        drainBattery(1);
    }
    public void viewMessageHistory(){
        System.out.println(messageHistory);
    }
    public void listMessages(String phoneNumber){
        System.out.println(messageHistory.get(phoneNumber));
    }



    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name=" + new Model(this.getBrand(), this.getColor(), this.getMaterial(), this.getBattery()) +
                ", imei='" + imei + '\'' +
                ", contactsList=" + contactsList +
                ", callHistory=" + callHistory +
                ", messageHistory=" + messageHistory +
                '}';
    }


}

