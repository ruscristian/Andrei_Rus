package tema.sci.exceptions_logging;

import org.apache.commons.math3.exception.NotANumberException;

import java.text.SimpleDateFormat;
import java.util.*;

import static tema.sci.exceptions_logging.SortMapByValue.*;

public class StudentsCatalog {

    Date date = new Date();
    SimpleDateFormat day = new SimpleDateFormat("dd");
    SimpleDateFormat month = new SimpleDateFormat("MM");
    SimpleDateFormat year = new SimpleDateFormat("yyyy");


    private List<Student> students = new LinkedList<>();
    private Map<Integer, List<String>> sameAgeStudents = new HashMap<>();
    private List<String> studentsInOrderByName = new ArrayList<>();
    private List<Student> studentsInOrderByDate = new ArrayList<Student>();




    //  * exceptions when validating conditions mentioned bellow
    public void addStudent(Student student) {

            if(student.getDateOfBirth().isEmpty() ||
                    student.getCnp().isEmpty() ||
                    student.getFirstName().isEmpty() ||
                    student.getLastName().isEmpty() )
            {
                try {
                    throw new EmptyInputException("Student with incomplete data");
                } catch (EmptyInputException e) {
                    System.out.println("A Student has insufficient data");
                }
            }
        students.add(student);


    }


    //* exceptions: ID is empty, student does not exist

    public void deleteStudentByCnp(String cnp) {

        try {
            for (Student studentByCnp : students) {
                if (studentByCnp.getCnp() == cnp) {
                    students.remove(studentByCnp);
                    break;
                } else {
                    throw new EmptyInputException("Student with incomplete data");
                }
            }
        } catch (EmptyInputException e) {
            System.out.println("CNP not found");
        }
    }


    //  * exceptions: age is not a number, age is negative
    public String retrieveAllStudentsWithAge(int age) {

        try {

            if (age < 0) {
                throw new AgeNegativeException();
            }

            for (Student studentByAge : students) {


                int currentIterationStudentDay = Integer.parseInt(studentByAge.getDateOfBirth().substring(0, 1));
                int currentIterationStudentMonth = Integer.parseInt(studentByAge.getDateOfBirth().substring(3, 4));
                int currentIterationStudentYear = Integer.parseInt(studentByAge.getDateOfBirth().substring(6));
                int currentDay = Integer.parseInt(day.format(date));
                int currentMonth = Integer.parseInt(month.format(date));
                int currentYear = Integer.parseInt(year.format(date));
                List<String> itemsByKey = sameAgeStudents.computeIfAbsent(age, k -> new ArrayList<>());

                if ((currentYear - currentIterationStudentYear) == age) {
                    itemsByKey.add(studentByAge.getFullName());
                    continue;
                } else if ((currentYear - currentIterationStudentYear) == age + 1) {
                    if (currentMonth < currentIterationStudentMonth) {
                        itemsByKey.add(studentByAge.getFullName());
                        continue;
                    } else if (currentMonth == currentIterationStudentMonth) {
                        if (currentDay < currentIterationStudentDay) {
                            itemsByKey.add(studentByAge.getFullName());
                            continue;
                        }
                    }
                }
            }
//            System.out.println(sameAgeStudents.getOrDefault(age, new ArrayList<>()));
        } catch (NotANumberException e) {
            System.out.println("We need integer not other types");
        } catch (AgeNegativeException e) {
            System.out.println("Age can not be negative");
        }


        return String.valueOf(sameAgeStudents.getOrDefault(age, new ArrayList<>()));
    }

    // * exceptions: any input is empty

    public void listStudentsInOrderByName() {
        try {
            for (Student student : students) {
                if(student.getFirstName().isEmpty() || student.getLastName().isEmpty())
                {throw new EmptyInputException("Student with incomplete data");}
                studentsInOrderByName.add(student.getFullName());
            }
            Collections.sort(studentsInOrderByName);
//        Arrays.sort(new List[]{studentsInOrderByName});
        } catch (EmptyInputException e) {
            System.out.println("First Name or Last Name not given ");
        }
    }

    public void listStudentsOrderByBirthDate() {

        try {
//            for (Student objToString : students) {
//                studentsInOrderByDate.add(objToString);
//            }
//            studentsInOrderByDate.sort(new Comparator<Student>() {
//                @Override
//                public int compare(Student s1, Student s2) {
//                    return s1.getDateOfBirthOnNumber() - s2.getDateOfBirthOnNumber();
//                }
//            });

            Map<Student, Integer> unsortedMap = new HashMap<>();
//      am ales sa aranjez asa map-ul pentru situatia in care o sa am studenti cu aceeasi zi de nastere
        for (Student student: students){
            if(student.getDateOfBirth().isEmpty())
            {throw new EmptyInputException("Student with incomplete data");}
            unsortedMap.put(student, student.getDateOfBirthOnNumber());
        }
        Map<Student, Integer> studentsInOrderByBirthDate = sortByComparator(unsortedMap, DESC);
        for(Student unsorted: studentsInOrderByBirthDate.keySet()){
            studentsInOrderByDate.add(unsorted);
        }
        printMap(studentsInOrderByBirthDate);
        } catch (EmptyInputException e) {
            System.out.println("Date of Birth not given");
        }
    }


    public List<Student> getStudents() {
        return students;
    }

    public Map<Integer, List<String>> getSameAgeStudents() {
        return sameAgeStudents;
    }

    public List<String> getStudentsInOrderByName() {
        return studentsInOrderByName;
    }

    public List<Student> getStudentsInOrderByDate() {
        return studentsInOrderByDate;
    }


    @Override
    public String toString() {
        return "StudentsCatalog{" +
                "date=" + date +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", students=" + students +
                ", sameAgeStudents=" + sameAgeStudents +
                ", studentsInOrderByName=" + studentsInOrderByName +
                '}';
    }
}

