package tema.sci.oop_homework.phone;

public class Message {

    private Contact contact;
    private StringBuilder message;
    private long time;

    public Message(Contact contact, StringBuilder message, long time) {
        this.contact = contact;
        this.message = message;
        this.time = time;
    }


    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "contact=" + contact +
                ", message='" + message + '\'' +
                ", time=" + time +
                '}';
    }
}
