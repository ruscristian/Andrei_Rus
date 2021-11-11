package tema.sci.java8_homework;

public class Student {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int monthNumber;

    public Student(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.monthNumber = Integer.valueOf(dateOfBirth.substring(3, 5));
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
