package tema.sci.exceptions_logging;

import java.util.List;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int dateOfBirthOnNumber;
    private char gender;
    private String cnp;


    public Student(String firstName, String lastName, String dateOfBirth, char gender, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cnp = cnp;
        this.dateOfBirthOnNumber = getDateOfBirthOnNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        String fullName = this.firstName + " " + this.lastName;
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public String getCnp() {
        return cnp;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirthOnNumber() {
        int studentBirthDay = Integer.parseInt(this.getDateOfBirth().substring(0, 1));
        int studentBirthMonth = Integer.parseInt(this.getDateOfBirth().substring(3, 4));
        int studentBirthYear = Integer.parseInt(this.getDateOfBirth().substring(6));

        return ((studentBirthYear * 10000) + (studentBirthMonth * 100) + studentBirthDay);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
