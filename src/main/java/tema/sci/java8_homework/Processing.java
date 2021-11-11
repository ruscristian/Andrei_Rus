package tema.sci.java8_homework;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Processing {

    private List<Student> studentList = new LinkedList<>();
    protected File fileOut = new File("src/main/resources/Java8Homework_out.csv");

    Scanner scanner = null;
    int counter = 0;

    public void updateDataFromCsv() {

        fileOut.delete();
        try  {
            scanner = new Scanner(new BufferedReader
                    (new FileReader("src/main/resources/Java8Homework_in.csv")));
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

    public void moveStudentDataToFile(int monthFilter){

        List<String> listForFileOut = studentList.stream()
                .filter(student -> student.getMonthNumber() == monthFilter)
                .map(student -> student.getFirstName() + "," + student.getLastName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listForFileOut);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut, true));

            for (String line: listForFileOut){
                writer.write(line + "\n" );
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
