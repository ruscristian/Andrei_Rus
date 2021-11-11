package tema.sci.java8_homework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tema.sci.IO.AthletesDataProcessing;

import java.io.File;
import java.util.Set;

import static org.mockito.Mockito.*;

public class ProcessingTest {
    @Mock
    Set<Student> studentList;
    @Mock
    File fileOut;
    @InjectMocks
    Processing processing;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateDataFromCsv() throws Exception {
        processing.updateDataFromCsv();
    }

    @Test
    public void testGetStudentFroamCsvLine() throws Exception {
        Student result = processing.getStudentFromCsvLine("input");
        Assert.assertEquals(new Student("firstName", "lastName", "dateOfBirth"), result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetStudentFromCsvLine() {
        //given
        AthletesDataProcessing testData = new AthletesDataProcessing();
        String inputLine = "1,Dorel,RO";
        //when
        testData.getAthleteFromCsvLine(inputLine);
    }

    @Test
    public void testMoveStudentDataToFile() throws Exception {
        processing.moveStudentDataToFile(5);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme