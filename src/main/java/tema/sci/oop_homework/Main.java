package tema.sci.oop_homework;

import tema.sci.oop_homework.phone.Brand;
import tema.sci.oop_homework.phone.Model;
import tema.sci.oop_homework.phone.OwnersPhone;
import tema.sci.oop_homework.phone_owner.PhoneOwner;

public class Main {

    public static void main(String[] args) {


        Brand samsung = new Brand("Samsung");
        Brand iPhone = new Brand("iPhone");
        Model samsungGalaxy = new Model(samsung, "blue", "Glass", 26);
        Model samsungGalaxy4 = new Model(samsung, "blue", "Glass", 23);
        Model iPhone5 = new Model(iPhone, "blue", "Glass", 26);
        Model iPhone10 = new Model(iPhone, "blue", "Glass", 23);

        samsung.addModel(samsungGalaxy);
        samsung.addModel(samsungGalaxy4);
        samsung.addModel(iPhone5);
        samsung.addModel(iPhone10);

        PhoneOwner andrei = new PhoneOwner("Rus", "Andrei");
        OwnersPhone andreiPhone = new OwnersPhone(andrei , "0753_425_326", "3474233004");


//        System.out.println(andreiPhone);
//        System.out.println(andrei);
        System.out.println(Brand.getModels());
//        System.out.println(samsungGalaxy);




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
