package tema.sci.java8_homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processing {

    private List<Student> studentList = new ArrayList<>();

    Scanner scanner = null;
    int counter = 0;

    public void updateDataFromCsv() {


        try  {
            scanner = new Scanner(new BufferedReader(new FileReader("src/main/resources/Java8Homework_in.csv")));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {

                String input = scanner.nextLine();
                studentList.add(getStudentFromCsvLine(input));
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
    public Student getStudentFromCsvLine(String input){
        String[] data = input.split(",");

        if (data.length != 3){
            throw new ArrayIndexOutOfBoundsException();
        }

        String firstName = data[0].trim();
        String lastName = data[1].trim();
        String dateOfBirth = data[2].trim();


        return new Student(firstName,lastName,dateOfBirth);

    }
}
