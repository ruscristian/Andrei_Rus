package tema.sci.oop_homework.phone;

import java.util.ArrayList;
import java.util.List;

abstract class Contacts {

    private String name;
    private long phoneNumber;
    private List<Messages> messagesList = new ArrayList<>();
}
