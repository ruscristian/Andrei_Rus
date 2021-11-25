package tema.sci.concurrency_homework;


public class FestivalAttendeeThread extends Thread {

    private TicketType ticketType;
    private FestivalGate gate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(340);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public TicketType getTicketType() {
        return ticketType;
    }
    public FestivalGate getGate() {
        return gate;
    }
}
