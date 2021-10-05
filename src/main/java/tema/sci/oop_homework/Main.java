package tema.sci.oop_homework;

import tema.sci.oop_homework.phone.Brand;
import tema.sci.oop_homework.phone.Model;
import tema.sci.oop_homework.phone.Phone;


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

//        System.out.println(samsung.getModels());
//        System.out.println(iPhone.getModels());


        Phone andreiPhone = new Phone(iPhone5 , "0753425326", "3474233004");



        andreiPhone.addContact("0742536253", "Andrei", "Rus");
        andreiPhone.addContact("0745637364", "Florin", "Pasca");
        andreiPhone.addContact("0753472325", "Razvan", "Chereches");

        System.out.println(andreiPhone.getContactsList());


        andreiPhone.call("0742536253");
        andreiPhone.call("0742536253");
        andreiPhone.call("0742537625");
        andreiPhone.call("0745637364");
        andreiPhone.call("0753472325");



//        System.out.println(andreiPhone);
//        System.out.println(andreiPhone.getBattery());

        andreiPhone.viewHistory();

        andreiPhone.sendMessage("0742536253", "Hello !");
        andreiPhone.sendMessage("0742536253", "Hello, Andrei !");
        andreiPhone.sendMessage("0734934922", "Hello, stranger");
        andreiPhone.sendMessage("0734934922", "Hello, strangerrr");

        andreiPhone.viewMessageHistory();
        andreiPhone.listMessages("0742536253");
        andreiPhone.listMessages("0734934922");

        andreiPhone.setColor("red");
        andreiPhone.setMaterial("Stone");
        System.out.println(andreiPhone);
        System.out.println(andreiPhone.getBattery());







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
