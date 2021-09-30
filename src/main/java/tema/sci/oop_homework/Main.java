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

        Phone andreiPhone = new Phone(samsung,"samsungGalaxy", Generators.getGeneratedLong());
        PhoneOwner andrei = new PhoneOwner(Generators.getGeneratedLong(), andreiPhone);

        System.out.println(andreiPhone);
        System.out.println(andrei);
        System.out.println(Brand.getModels());

    }
}
