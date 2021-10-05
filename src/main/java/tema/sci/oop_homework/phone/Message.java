package tema.sci.oop_homework.phone;

public class Message {

    private Contact contact;
    private StringBuilder message;
    private long time;

    public Message(Contact contact, StringBuilder message, long time) {
        this.contact = contact;
        this.time = time;


        message.setLength(100);

        if(message.length() > 100){
            message = new StringBuilder("Message to big. The limit is 100 char!");
            // Ceva nu functioneaza...
        } else { this.message = message;}
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
