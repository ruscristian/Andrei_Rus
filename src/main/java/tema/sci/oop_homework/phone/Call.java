package tema.sci.oop_homework.phone;


public class Call {

    private Contact contact;
    private long time;

    public Call(Contact contact, long time) {
        this.contact = contact;
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Call{" +
                "contact=" + contact +
                ", time=" + time +
                '}';
    }

}
