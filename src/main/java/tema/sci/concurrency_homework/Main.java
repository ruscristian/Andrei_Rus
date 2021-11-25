package tema.sci.concurrency_homework;

import sun.awt.Mutex;

public class Main {


    public static void main(String[] args) {


        FestivalGate gate = new FestivalGate();





        Thread tr = new Thread(new Runnable() {
            @Override
            public void run() {
                int attendee = 0;
                for (int i = 0; i < 120; i++) {

                    gate.addNewAttendee();
                    gate.getFestivalAttendeeList().get(attendee).start();
                    try {
                        gate.getFestivalAttendeeList().get(attendee).join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    attendee++;
                }
            }
        });

        FestivalStatisticsThread statisticsThread = new FestivalStatisticsThread(gate, tr);

        tr.start();
        statisticsThread.start();
    }
}
