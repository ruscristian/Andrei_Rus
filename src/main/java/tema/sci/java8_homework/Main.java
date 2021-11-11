package tema.sci.java8_homework;

public class Main {

    public static void main(String[] args) {


        Processing process = new Processing();
        process.updateDataFromCsv();
        process.moveStudentDataToFile(5);

        process.moveStudentDataToFile(9);



    }
}
