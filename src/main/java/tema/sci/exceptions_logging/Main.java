package tema.sci.exceptions_logging;

import java.util.List;

public class Main {


    public static void main(String[] args) {


        StudentsCatalog clasa_aXII_A = new StudentsCatalog();
        Student danielOprea = new Student("Oprea", "Daniel",
                "17.03.2003", 'm', "5030520203456");

        Student ovidiuMuresan = new Student("Muresan", "Ovidiu",
                "21.09.2003", 'm', "5030565203456");

        Student valentinRus = new Student("Rus", "Valentin",
                "09.03.2003", 'm', "5030520203402");

        Student minodoraConstaintin = new Student("Constantin", "Minodora",
                "01.01.2004", 'f', "5030520203403");

        Student ancaMos = new Student("Mos", "Anca",
                "31.12.2002", 'f', "5030520203404");

        Student tudorGliga = new Student("Gliga", "Tudor",
                "05.08.2004", 'm', "5030520203405");

        Student danielaBasarab = new Student("Basarab", "Daniela",
                "25.07.2003", 'f', "5030520203406");

        Student tomaBucur = new Student("Bucur", "Toma",
                "24.12.2003", 'm', "5030520203407");

        Student alexGyorfi = new Student("Gyorfi", "Alex",
                "01.10.2005", 'm', "5030520203408");

//        Student alexBota = new Student("Bota", "",
//                "01.09.2005", 'm', "5030520203409");

        clasa_aXII_A.addStudent(danielaBasarab);
        clasa_aXII_A.addStudent(ovidiuMuresan);
        clasa_aXII_A.addStudent(danielOprea);
        clasa_aXII_A.addStudent(valentinRus);
        clasa_aXII_A.addStudent(minodoraConstaintin);
        clasa_aXII_A.addStudent(ancaMos);
        clasa_aXII_A.addStudent(tomaBucur);
        clasa_aXII_A.addStudent(tudorGliga);
        clasa_aXII_A.addStudent(alexGyorfi);
//        clasa_aXII_A.addStudent(alexBota);


        clasa_aXII_A.listStudentsInOrderByName();
        System.out.println(clasa_aXII_A.getStudentsInOrderByName());

        clasa_aXII_A.listStudentsOrderByBirthDate();
        System.out.println(clasa_aXII_A.getStudentsInOrderByDate());

        System.out.println(clasa_aXII_A.retrieveAllStudentsWithAge(16));
        System.out.println(clasa_aXII_A.retrieveAllStudentsWithAge(17));
        System.out.println(clasa_aXII_A.retrieveAllStudentsWithAge(18));


    }
}
