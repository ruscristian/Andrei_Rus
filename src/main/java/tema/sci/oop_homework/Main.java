package tema.sci.oop_homework;

import tema.sci.oop_homework.phone.Brand;
import tema.sci.oop_homework.phone.Phone;
import tema.sci.oop_homework.phone_owner.PhoneOwner;
import tema.sci.oop_homework.util.Generators;

public class Main {

    public static void main(String[] args) {


        Brand samsung = new Brand("Samsung");
        samsung.addModel("samsungGalaxy", "blue", "Glass", 25);
        samsung.addModel("samsungGalaxy", "Green", "Glass", 25);
        samsung.addModel("samsungGalaxy", "purple", "Plastic", 24);
        samsung.addModel("samsungGalaxy", "red", "Plastic", 23);
        samsung.addModel("samsungGalaxy", "brown", "Glass", 12);
        samsung.addModel("samsungGalaxy", "pink", "Wood", 25);

        Phone andreiPhone = new Phone(samsung,"samsungGalaxy");
        PhoneOwner andrei = new PhoneOwner(andreiPhone);

        System.out.println(andreiPhone);
        System.out.println(andrei);
        System.out.println(Brand.getModels());

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
