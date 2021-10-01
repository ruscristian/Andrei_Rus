package tema.sci.oop_homework;

import tema.sci.oop_homework.phone.Brand;
import tema.sci.oop_homework.phone.Model;
import tema.sci.oop_homework.phone.Phone;
import tema.sci.oop_homework.phone_owner.PhoneOwner;

public class Main {

    public static void main(String[] args) {


        Brand samsung = new Brand("Samsung");
        Model samsungGalaxy = new Model("Samsung Galaxy", "blue", "Glass", 26);
        samsung.addModel(samsungGalaxy);
        Phone andreiPhone = new Phone( "0753_425_326", samsung, samsungGalaxy,"3474233004");
        PhoneOwner andrei = new PhoneOwner("Rus", "Andrei", andreiPhone);

//        System.out.println(andreiPhone);
        System.out.println(andrei);
//        System.out.println(Brand.getModels());
        System.out.println(andreiPhone);




//        *** Homework API ***
//
//        Phone phone= new Samsung(); // shouldn't compile
//
//        Phone phone = new SamsungGalaxy6();
//
//
//
//        phone.addContact("1", "phone number", "fist name", "last name");
//
//        phone.addContact("2", "phone number", "fist name", "last name");
//
//        phone.listContacts();
//
//
//
//        // send a message to the first contact from the previous listed
//
//        // max number of characters - 100
//
//        phone.sendMessage("phone number", "message content");
//
//        phone.listMessages("phone number");
//
//
//
//        // send a message to the second contact from the previous listed
//
//        phone.call("phone number");
//
//        phone.viewHistory();



    }
}
