package tema.sci.concurrency_homework;

public class FestivalStatisticsThread extends Thread {


    private FestivalGate gate;
    private Thread gateThread;

    private int attendees;
    private int full;
    private int free_pass;
    private int full_vip_pass;
    private int one_day_vip_pass;
    private int one_day_pass;


    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    public FestivalStatisticsThread(FestivalGate gate, Thread tr) {
        this.gate = gate;
        this.gateThread = tr;
    }

    @Override
    public void run() {

        boolean shouldStillRun = true;
        while(!gateThread.getState().equals(State.TERMINATED) || shouldStillRun){

            generateStatistics();
            printStatistics();

            if (gateThread.getState().equals(State.TERMINATED)) {
                shouldStillRun = false;
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void printStatistics() {
        System.out.println("Attendees: "+ attendees +
                "\nFull tickets: " + full +
                "\nFree passes: "+free_pass+
                "\nFull VIPs: " + full_vip_pass +
                "\nOne-day: "+one_day_pass+
                "\nOne-day VIPs: "+ one_day_vip_pass);
    }

    private void generateStatistics() {

        this.full =0 ;
        this.full_vip_pass =0;
        this.free_pass= 0 ;
        this.one_day_vip_pass=0;
        this.one_day_pass=0;

        for (FestivalAttendeeThread iterator : gate.getFestivalAttendeeList()) {
            if (iterator.getTicketType() == (TicketType.FULL)) {
                this.full += 1;
            } else if (iterator.getTicketType() == (TicketType.FREE_PASS)) {
                this.free_pass += 1;
            } else if (iterator.getTicketType() == (TicketType.FULL_VIP)) {
                this.full_vip_pass += 1;
            } else if (iterator.getTicketType() == (TicketType.ONE_DAY)) {
                this.one_day_pass += 1;
            } else if (iterator.getTicketType() == (TicketType.ONE_DAY_VIP)) {
                this.one_day_vip_pass += 1;
            }
        }

        this.attendees = gate.getFestivalAttendeeList().size();
    }
}
