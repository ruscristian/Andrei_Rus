package tema.sci.concurrency_homework;

import java.security.SecureRandom;
import java.util.*;

public class FestivalGate{


    private List<FestivalAttendeeThread> festivalAttendeeList = Collections.synchronizedList(new ArrayList<>());


    public List<FestivalAttendeeThread> getFestivalAttendeeList() {
        return festivalAttendeeList;
    }


    public TicketType getRandomTicketType(){
       return TicketType.values()[new SecureRandom().nextInt(TicketType.values().length)];
    }

    public void addNewAttendee(){
        festivalAttendeeList.add(new FestivalAttendeeThread(getRandomTicketType(), this));
    }
}