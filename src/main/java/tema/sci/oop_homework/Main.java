package tema.sci.oop_homework;

import tema.sci.oop_homework.phone.Brand;
import tema.sci.oop_homework.phone.Model;
import tema.sci.oop_homework.phone.OwnersPhone;


public class Main {

    public static void main(String[] args) {


        Brand samsung = new Brand("Samsung");
        Brand iPhone = new Brand("iPhone");
        Model samsungGalaxy = new Model(samsung, "blue", "Glass", 26);
        Model samsungGalaxy4 = new Model(samsung, "blue", "Glass", 23);
        Model iPhone5 = new Model(iPhone, "green", "Glass", 26);
        Model iPhone10 = new Model(iPhone, "green", "Glass", 23);

        samsung.addModel(samsungGalaxy);
        samsung.addModel(samsungGalaxy4);
        iPhone.addModel(iPhone5);
        iPhone.addModel(iPhone10);
        System.out.println(samsung.getModels());
        System.out.println(iPhone.getModels());




        OwnersPhone andreiPhone = new OwnersPhone(iPhone5 , "0753425326", "3474233004");



        andreiPhone.addContact("07425362537", "Andrei", "Rus");
        System.out.println(andreiPhone.getContactsList());



        andreiPhone.call("07425362537");
        andreiPhone.call("07425362537");
        andreiPhone.call("07425376257");
        andreiPhone.viewHistory();
        andreiPhone.sendMessage("07425362537", new StringBuilder(""));
        andreiPhone.viewMessageHistory();
        System.out.println(andreiPhone);





//        System.out.println(andreiPhone);
//        System.out.println(andrei);
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
